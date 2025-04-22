public class exercicio_08 {
    public int [] cartaoCrtedito () {

        int [] somaVetor = new int[1000];
        int soma = 0;
        int limite = 1500;
        for (int i = 0; i <= 1000; i++) {
            soma = i + soma;
            System.out.println("Interação: "+ i +" | Soma: " + soma);
            somaVetor [i] = soma;
            if (soma >= limite) {
                    break;
            }


    }
        return somaVetor;
    }}
