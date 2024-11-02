import org.junit.jupiter.api.*;

public class JUnitCalculator {
    Calculator c;

    @BeforeAll
    public static void classSetup(){

    }
    @BeforeEach
    public void testSetup() {
        System.out.println("The method runs before each test!");
        c = new Calculator();
    }


    @Test
    public void testAdditionWithZero(){

        Assertions.assertEquals(4, c.compute(4,0,"+"), "Addition with zero failed");
    }
    @Test
    public void testAdditionWithNegative(){

        Assertions.assertEquals(-1,c.compute(3,-4,"+"),"Addition with negative number failed");
    }

    @Test
    public void testSubtractionWithZero() {
        Assertions.assertEquals(5, c.compute(5, 0, "-"), "Subtraction with zero failed.");
    }
    @Test
    public void testSubtractionWithNegative() {
        Assertions.assertEquals(8, c.compute(4, -4, "-"), "Subtraction with a negative number failed.");
    }

    @Test
    public void testMultiplicationWithZero() {
        Assertions.assertEquals(0, c.compute(5, 0, "*"), "Multiplication with zero failed.");
    }
    @Test
    public void testMultiplicationWithNegative() {
        Assertions.assertEquals(-20, c.compute(5, -4, "*"), "Multiplication with a negative number failed.");
    }
    @Test
    public void testDivisionSimple() {
        Assertions.assertEquals(2, c.compute(10, 5, "/"), "Simple division failed.");
    }
    @Test
    public void testDivisionWithNegative() {
        Assertions.assertEquals(-2, c.compute(10, -5, "/"), "Division with a negative number failed.");
    }

    @AfterEach
    public void cleanTest(){
        System.out.println("Cleanup after the test.");

    }

    @AfterAll
    public static void cleanClass(){
        System.out.println("Cleaup at the end");
    }


}
