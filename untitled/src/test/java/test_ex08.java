import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test_ex08 {

    int [] cartaoCredito;
    exercicio_08 exercicio_08;

    @Before
    public void before () {
        cartaoCredito = new int []{0, 1, 3, 6};
        exercicio_08 = new exercicio_08();
    }

    @Test
    public void testeCartao (){
        int [] vetorAtual = exercicio_08.cartaoCrtedito ();
        for (int i = 0; i < cartaoCredito.length; i++) {
            Assert.assertEquals(cartaoCredito[i], vetorAtual[i]);
        }

    }


}
