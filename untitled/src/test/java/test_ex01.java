import org.junit.Assert;
import org.junit.Test;

public class test_ex01 {

    @Test
    public void testePalavraDigitada () {
        exercicio_01 exercicio_01 = new exercicio_01();
        String palavraDigitada = "Testeunitario";
        Assert.assertEquals("Voce digitou:"+ palavraDigitada, exercicio_01.exibirPalavra(palavraDigitada));
    }
}
