package testng;

import org.testng.annotations.*;

public class AnnotationsExample {

    //BeforeSuite - execute before the entire suite
    //BeforeTest -  execute before each test
    //BeforeClass - execute before each test class
    //BeforeMethod - executes before each test method
    //Test - test the script
    //AfterMethod - execute after every test method
    //AfterClass - executes after each test class
    //AfterTest - execute after each test
    //AfterSuite - execute after each test Suite

    @Test
    public void Test1() {
        System.out.println("Test1");
    }
    @Test
    public void Test2() {
        System.out.println("Test2");
    }
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");
    }

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite");
    }








}
