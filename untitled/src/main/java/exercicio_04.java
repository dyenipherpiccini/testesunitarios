public class exercicio_04 {
    public int calcularSoma (int primeiroValor, int segundoValor, int terceiroValor) {
        int soma = primeiroValor + segundoValor + terceiroValor;
        return soma;
    }

    public int calcularSubtracao (int primeiroValor, int segundoValor, int terceiroValor) {
        int subtracao = segundoValor - primeiroValor;
        return subtracao;
    }

    public int calcularMultiplicacao (int primeiroValor, int segundoValor, int terceiroValor) {
        int multiplicacao = primeiroValor * segundoValor * terceiroValor;
        return multiplicacao;
    }

    public int calcularMedia (int primeiroValor, int segundoValor, int terceiroValor) {
        int media = calcularMultiplicacao(primeiroValor, segundoValor, terceiroValor)/3;
        return media;
    }
}
