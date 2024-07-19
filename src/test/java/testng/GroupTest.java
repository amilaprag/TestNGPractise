package testng;

import org.testng.annotations.Test;

public class GroupTest {

    // s-smoke test r-regression test
    @Test(groups = {"s","r"})
    public void test1(){
        System.out.println( "someke and regression");
    }
    @Test(groups = {"s","r"})
    public void test2(){
        System.out.println("someke and regression" );
    }
    @Test
    public void test3(){
        System.out.println("not smoke and regression test" );
    }
    @Test(groups = {"r"})
    public void test4(){
        System.out.println("someke test" );
    }
    @Test
    public void test5(){
        System.out.println("someke test" );
    }
}
