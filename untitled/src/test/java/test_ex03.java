import org.junit.Assert;
import org.junit.Test;

public class test_ex03 {
    @Test
    public void testeDobro (){
        exercicio_03 exercicio_03 = new exercicio_03();
        Assert.assertEquals(4, exercicio_03.calcularDobro(2));
    }
}
