package testng;

import org.testng.annotations.Test;

public class TestNGAnnotation {

    @Test(priority = 1)
    public void Test1(){
        System.out.println("Test 1");
    }
}
