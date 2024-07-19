package testng;

import org.testng.annotations.Test;

public class PriorityTests {

    @Test (priority = 0)
    public void testLogin(){
        System.out.println( "1");
    }
    @Test(priority = 1)
    public void testCreate(){
        System.out.println("2" );
    }
    @Test(priority = 2,enabled = false)
    public void testEdit(){
        System.out.println("3" );
    }
    @Test(priority = 3)
    public void testDelete(){
        System.out.println("4" );
    }
    @Test(priority = 4)
    public void testLogout(){
        System.out.println( "5");

    }
}
