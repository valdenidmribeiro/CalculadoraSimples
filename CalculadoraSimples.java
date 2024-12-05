package CalculadoraSimples;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma das seguintes opções: ");
            System.out.println("(1) Adição");
            System.out.println("(2) Subtração");
            System.out.println("(3) Multiplicação");
            System.out.println("(4) Divisão");
            System.out.println("(0) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 0) break;

            if (opcao < 1 || opcao > 4) {
                System.out.println("\nOpção inválida! Tente novamente.");
                continue; // Volta ao início do loop sem solicitar os números
            }

            System.out.print("\nEntre com o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Entre com o segundo número: ");
            int num2 = sc.nextInt();

            System.out.println("\nResultados:");

            switch (opcao) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    } else {
                        System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                    }
                    break;
            }
        } while (opcao != 0);

        System.out.println("\nFim!");
        sc.close();
    }
}
