import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float salario, percentual;
        System.out.println("Informe seu salário: ");
        salario = teclado.nextFloat();
        System.out.println("Informe seu percentual de aumento:" );
        percentual = teclado.nextFloat();

        System.out.println("O valor do seu novo salário é: R$ " + (salario + salario * percentual / 100));
    }
}

