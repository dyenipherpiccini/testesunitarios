public class exercicio_08 {
    public void cartaoCrtedito () {

        int soma = 0;
        int limite = 1500;
        for (int i = 0; i <= 1000; i++) {
            soma = i + soma;
            System.out.println("Interação: "+ i +" | Soma: " + soma);
            if (soma >= limite) {
                    break;
            }
        }

    }
}
