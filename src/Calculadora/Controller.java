// CONTROLLER
package Calculadora;

import java.lang.reflect.Method;

public class Controller {
    Model minhasOperacoes = new Model();

    // Mapeamento da opção para o nome do método
    private String getMethodName(int opcao) {
        return switch (opcao) {
            case 1 -> "multiplicate";
            case 2 -> "div";
            case 3 -> "add";
            case 4 -> "sub";
            default -> null;
        };
    }

    public float ControllerCalculadora(int opcao, float num1, float num2) throws IllegalArgumentException {
        String methodName = getMethodName(opcao);
        if (methodName == null) {
            throw new IllegalArgumentException("Opção inválida!");
        }

        try {
            // Obtém o método da classe Model com base no nome
            Method method = Model.class.getMethod(methodName, float.class, float.class);

            // Invoca o método dinamicamente
            Object result = method.invoke(minhasOperacoes, num1, num2);

            return (float) result;

        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Operação não implementada: método '" + methodName + "' não encontrado.");
        } catch (Exception e) {
            // Tratamento de erros de invocação (ex: divisão por zero já lançada no Model)
            if (e.getCause() instanceof IllegalArgumentException) {
                throw (IllegalArgumentException) e.getCause();
            }
            throw new RuntimeException("Erro ao executar operação.", e);
        }
    }
}