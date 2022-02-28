import org.testng.Assert;
import org.testng.annotations.Test;

public class calci {
    @Test
    public void add() {
        int sum = new Calculator().getSum(5 ,20);
        Assert.assertEquals(25,sum);


    }


    @Test
    public void subtract(){
        int subt = new Calculator().getSubt(30, 10);
        Assert.assertEquals(20,subt);

    }

}
