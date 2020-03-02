package jUnitTesting;

import org.junit.*;

public class testRunner {
	@BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("Running before class\n");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("Running after class");
    }

    /*Running after each test case*/
    @Before
    public void runBeforeTestMethod() {
        System.out.println("Running before test case");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("Running after test case\n");
    }

    @Test
    public void test_method_1() {
        System.out.println("Test Case #1");
        sumTest test1 = new sumTest();
        test1.test();
    }

    @Test
    public void test_method_2() {
    	System.out.println("Test Case #2");
    	testWordCount test2 = new testWordCount();
    	test2.test();
    }
}
