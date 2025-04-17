import org.junit.Assert;
import org.junit.Test;

public class test_ex05 {

    @Test
    public void verificarAprovacao (){
        exercicio_05 exercicio_05 = new exercicio_05();
        Assert.assertEquals("Você está aprovado", exercicio_05.verificarAprovacao(8,6));
        Assert.assertEquals("Você está de exame", exercicio_05.verificarAprovacao(5,5));
        Assert.assertEquals("Você está reprovado", exercicio_05.verificarAprovacao(4,3));
    }
}
