import javax.swing.*;

public class exercicio_10 {
    public static void main(String[] args) {

        int i = 0;
        int numeroDigitado = 0;
        int menorNumero = 0;

        while (i <= 5) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        System.out.println(numeroDigitado);
        if (numeroDigitado < menorNumero || i == 1) {
            menorNumero = numeroDigitado;
        }
        i ++;
        }
        System.out.println("O menor numero digitado é" + menorNumero);
    }
}
