// VIEW
package Calculadora;

import java.util.Scanner;

public class View {
    Scanner leitor = new Scanner(System.in);
    float num1, num2;
    int opcao;

    public void Menu() {
        System.out.println("Bem-vindo a Calculadora!");
        System.out.println("Digite a opção correspondente a qual operação você deseja realizar:\n" +
                "1) Multiplicação\n" +
                "2) Divisão\n" +
                "3) Soma\n" +
                "4) Subtração\n"
        );
        this.opcao = this.leitor.nextInt();
    }

    public void LeitorNumeros() {
        System.out.print("Digite o primeiro número: ");
        this.num1 = this.leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        this.num2 = this.leitor.nextFloat();
    }

    public void ImprimeResultado() {
        Controller controller = new Controller();
        try {
            float resultado = controller.ControllerCalculadora(this.opcao, this.num1, this.num2);
            System.out.println("O resultado é " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}