package simple.calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import simplecalculator.calculator;

public class SimpleCalculatorTest {

    @Test
    public void testsum(){
        int actualValue = calculator.calSum(20,10);
        Assert.assertEquals(actualValue,30,"failed to cal sum");

        int actualValue2 = calculator.calSum(10,10);
        Assert.assertEquals(actualValue2,20,"failed to cal sum");
    }

    @Test
    public void testsubstraction(){
        int actualValue = calculator.calSubstraction(20,10);
        Assert.assertEquals(actualValue,10,"failed to cal sum");

        int actualValue2 = calculator.calSubstraction(10,10);
        Assert.assertEquals(actualValue2,0,"failed to cal sum");
    }

}
