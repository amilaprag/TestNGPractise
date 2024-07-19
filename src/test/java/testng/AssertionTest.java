package testng;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    SoftAssert softAssert = new SoftAssert();
    String actualValue = "Amila";

    @Test
    public void valuesEqualCheck(){
        String expectedValue = "Amila11";
        softAssert.assertEquals(actualValue,expectedValue,"value equals");
        softAssert.assertAll();
    }

    @Test
    public void valuesNotEqualCheck(){
        String expectedValue = "Amila7777";
        softAssert.assertNotEquals(actualValue,expectedValue,"value not equals");
    }

    @Test
    public void trueConditionCheck(){
        softAssert.assertTrue(actualValue.startsWith("A"),"value start without s");
    }


}
