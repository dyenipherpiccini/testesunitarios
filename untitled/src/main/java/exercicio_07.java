public class exercicio_07 {
    public int [] somaMaisDois (int numeroDigitado) {
        int [] somaDois = new int [100];
        for (int i = 0; i < 99; i++){
            numeroDigitado = numeroDigitado + 2;
            System.out.println("Interação" + i + "Valor" +numeroDigitado);
            somaDois [i] = numeroDigitado;
        }
        System.out.println("Fim");
        return somaDois;
    }
}
