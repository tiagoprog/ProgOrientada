import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Digite o primeiro número (a): ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número (b): ");
        double b = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.printf("%.2f %c %.2f = %.2f%n", a, operacao, b, resultado);
        }
        scanner.close();
    }
}