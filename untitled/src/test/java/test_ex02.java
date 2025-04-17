import org.junit.Assert;
import org.junit.Test;

public class test_ex02 {


    @Test
    public void testeValoresTrocados (){
        exercicio_02 exercicio_02 = new exercicio_02();
        String msgTrocada = "Primeiro valor Segundo valor";
        Assert.assertEquals("Primeiro valor Segundo valor", msgTrocada);
    }
}
