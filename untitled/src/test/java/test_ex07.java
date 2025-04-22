import org.junit.Assert;
import org.junit.Test;

public class test_ex07 {

    @Test
    public void testSomaDois (){
        int [] somaDoisAssert = {3, 5, 7};
        exercicio_07 exercicio_07 = new exercicio_07 ();
        int [] valorAtual = exercicio_07.somaMaisDois(1);
        for (int i = 0; i < somaDoisAssert.length; i++) {
            Assert.assertEquals(somaDoisAssert [i], valorAtual[i]);
        }
    }
}
