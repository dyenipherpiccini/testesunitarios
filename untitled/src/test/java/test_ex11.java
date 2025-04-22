import org.junit.Assert;
import org.junit.Test;

public class test_ex11 {

    @Test
    public void calcularFatorial (){
        exercicio_11 exercicio_11 = new exercicio_11();
        Assert.assertEquals("0", exercicio_11.calculaFatorial(10).toString());
    }

    @Test
    public void calcularFatorialVezesZero (){
        exercicio_11 exercicio_11 = new exercicio_11();
        Assert.assertEquals("0", exercicio_11.calculaFatorial(0).toString());
    }

}
