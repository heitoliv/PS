import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Bem-vindo a Calculadora!");

        System.out.println("Digite a opção correspondente a qual operação você deseja realizar:\n" +
                "1) Multiplicação\n" +
                "2) Divisão\n" +
                "3) Soma\n" +
                "4) Subtração\n" +
                "\n"
        );
        Scanner leitor = new Scanner(System.in);

        Operacoes minhasOperacoes = new Operacoes();

        System.out.print("Escolha sua opção: ");
        int opcao = leitor.nextInt();


        float num1, num2, resultado;

        if (opcao == 1) {
            System.out.print("Digite o primeiro número: ");
            num1 = leitor.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = leitor.nextFloat();


            resultado = minhasOperacoes.multiplicate(num1, num2);
            System.out.println("O resultado da multiplicação é: " + resultado);

        } else if (opcao == 2) {
            System.out.print("Digite o primeiro número: ");
            num1 = leitor.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = leitor.nextFloat();

            resultado = minhasOperacoes.div(num1, num2);
            System.out.println("O resultado da divisão é: " + resultado);

        } else if (opcao == 3) {
            System.out.print("Digite o primeiro número: ");
            num1 = leitor.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = leitor.nextFloat();

            resultado = minhasOperacoes.add(num1, num2);
            System.out.println("O resultado da soma é: " + resultado);

        } else if (opcao == 4) {
            System.out.print("Digite o primeiro número: ");
            num1 = leitor.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = leitor.nextFloat();

            resultado = minhasOperacoes.sub(num1, num2);
            System.out.println("O resultado da subtração é: " + resultado);

        } else {
            System.out.println("Opção inválida!");
        }
        leitor.close();
    }
}

