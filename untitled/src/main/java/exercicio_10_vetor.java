public class exercicio_10_vetor {
    public int retornaMenorNumero (int[] vetorNumeros) {

        int i = 0;
        int menorNumero = 0;

        menorNumero = vetorNumeros[0];
        for (i=0; i < vetorNumeros.length; i++)
            if (vetorNumeros[i] < menorNumero) {
            menorNumero = vetorNumeros[i];
        }
        return menorNumero;
        }
    }

