import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        int t = scanner.nextInt();

        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        System.out.println(t + " segundos correspondem a " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

        scanner.close();
    }
}
