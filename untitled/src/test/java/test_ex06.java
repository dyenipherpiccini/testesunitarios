import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test_ex06 {

    exercicio_06 exercicio_06;

    @Before
    public void before(){
        exercicio_06 = new exercicio_06();
    }

    @Test
    public void faixaUm () {
        Assert.assertEquals("99.0", exercicio_06.calcularINSS(1320.00).toString());
    }
    @Test
    public void faixaDois () {
        Assert.assertEquals("118.89", exercicio_06.calcularINSS(1321.00).toString());
    }
    @Test
    public void faixaTres () {
        Assert.assertEquals("308.676", exercicio_06.calcularINSS(2572.30).toString());
    }
    @Test
    public void faixaQuatro () {
        Assert.assertEquals("1051.04", exercicio_06.calcularINSS(7510.49).toString());
    }
    @Test
    public void faixaCinco () {
        Assert.assertEquals("1051.04", exercicio_06.calcularINSS(7510.49).toString());
    }

}
