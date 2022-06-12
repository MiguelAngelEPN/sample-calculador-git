package ec.edu.epn.git.calculator;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        //assertEquals( expected: 6, c.subtraction(a: 3, b:3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test 2");
        //assertEquals(expected: 7, c.subtraction(a: 10, b:3));
    }

    @Test(expected =ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        System.out.println("Test 3");
        //assertEquals(expected: 1, c.division(a: 1, b: 0), delta: 0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception(){
        System.out.println("test 4");
        c.timeout(100);
    }

    @After
    public void tearDown(){
        System.out.println("TearDown()");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDownClass()");
    }
}