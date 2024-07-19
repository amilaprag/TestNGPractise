package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTest {
    @Test(priority = 0)
    public void testLogin() {
        System.out.println("1");
      //  Assert.assertEquals(1,2);
    }

    @Test(dependsOnMethods ="testLogin" )
    public void testCreate() {
        System.out.println("2");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate"},alwaysRun = true)
    public void testEdit() {
        System.out.println("3");
    }

}
