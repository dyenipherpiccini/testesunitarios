public class exercicio_05 {
    public String verificarAprovacao (double primeiraNota, double segundaNota) {

        double media = (primeiraNota * segundaNota) / 2;

        if (media > 5) {
            return "Você está aprovado";
        }
        if (media == 5) {
            return "Você está exame";
        }
        else {
            return "Você está reprovado";
        }

        }
    }
