package Calculadora;

public class Controller {

    Model minhasOperacoes = new Model();

    public float ControllerCalculadora(int opcao, float num1, float num2) throws IllegalArgumentException{
        float resultado;
        switch (opcao) {
            case 1: {
                resultado = minhasOperacoes.multiplicate(num1, num2);
                break;
            }
            case 2: {
                resultado = minhasOperacoes.div(num1, num2);
                break;
            }
            case 3: {
                resultado = minhasOperacoes.add(num1, num2);
                break;
            }
            case 4: {
                resultado = minhasOperacoes.sub(num1, num2);
                break;
            } default: {
                throw new IllegalArgumentException("Opção inválida!");
            }
        }
        return resultado;
    }
}
