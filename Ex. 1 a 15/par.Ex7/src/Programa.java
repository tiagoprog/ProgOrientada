import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "É par");
        } else if (n % 2 == 1) {
            JOptionPane.showMessageDialog(null, "É impar");
        }
    }
}
