package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 @Listeners(ListnersTest.class)
public class ListnersExample {
    @Test
    public void test1(){
        System.out.println( "1");
    }
    @Test
    public void test2(){
        Assert.assertTrue(false);
        System.out.println( "2");
    }
    @Test
    public void test3(){
        System.out.println( "1");
    }
    @Test
    public void test4(){
        System.out.println( "1");
    }
}
