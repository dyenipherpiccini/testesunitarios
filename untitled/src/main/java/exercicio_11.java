public class exercicio_11 {
    public int calculaFatorial (int numeroFatorialDigitado) {

        for (int i = numeroFatorialDigitado; i >= 1; i--) {
            numeroFatorialDigitado = numeroFatorialDigitado * (i - 1);

        }
        if (numeroFatorialDigitado == 0) {
            System.out.println("O fatorial é 1");
        }
        return numeroFatorialDigitado;
    }
}
