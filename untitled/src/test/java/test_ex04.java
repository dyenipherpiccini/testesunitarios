import org.junit.Assert;
import org.junit.Test;

public class test_ex04 {

    @Test
    public void testeCalcularSoma (){
        exercicio_04 exercicio_04 = new exercicio_04();
        Assert.assertEquals(6, exercicio_04.calcularSoma(1,2,3));
        Assert.assertEquals(4, exercicio_04.calcularSubtracao(4,8,0));
        Assert.assertEquals(8, exercicio_04.calcularMultiplicacao(2,2,2));
        Assert.assertEquals(9, exercicio_04.calcularMedia(3,3,3));
    }
}

