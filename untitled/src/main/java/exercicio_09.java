public class exercicio_09 {
    public void multiplicaInteracoes () {

        int multiplicacao = 1;
        for (int i = 1; i <= 1000; i++){
            if (multiplicacao >= 1000){
                multiplicacao = 1;
            }
            System.out.println("i "+ "x" + "Total: "+ multiplicacao +" = "+ multiplicacao);
            multiplicacao = i + multiplicacao;
            System.out.println("i "+ "x" + "Total: "+ multiplicacao +" = "+ multiplicacao);
        }
    }
}
