package homework_JUnit_TestNg;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import Calculator.Calculator;


public class TestNGCalculator {
    Calculator c;
    final String subtractionFailMessage = "Subtraction failed.";
    final String multiplicationFailMessage = "Multiplication failed.";
    final String divisionFailMessage = "Division failed.";
    ExtentReports extent = new ExtentReports();
    ITestContext testContext;


    @DataProvider
    public Iterator<Object[]> calculatorDataProvider() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new Object[] {10, 20, 10, "-", subtractionFailMessage});
        dp.add(new Object[] {100, 200, 100, "-", subtractionFailMessage});
        dp.add(new Object[] {0, 1 , 1 , "-", subtractionFailMessage});
        return dp.iterator();
    }

    @DataProvider
    public Iterator<Object[]> calculatormultDataProvider() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new Object[] {81, 9, 9, "*", multiplicationFailMessage});
        dp.add(new Object[] {50, 5, 10, "*", multiplicationFailMessage});
        dp.add(new Object[] {100, 10 , 10 , "*", multiplicationFailMessage});
        return dp.iterator();
    }

    @DataProvider
    public Iterator<Object[]> calculatordivDataProvider() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new Object[] {10, 100, 10, "/", divisionFailMessage});
        dp.add(new Object[] {5, 50, 10, "/", divisionFailMessage});
        dp.add(new Object[] {9, 81 , 9 , "/", divisionFailMessage});
        return dp.iterator();
    }

    private void setupGeneric() {
        c = new Calculator();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/report.html");
        extent.attachReporter(sparkReporter);
    }

    @BeforeSuite
    public void setUpSuite() {
        setupGeneric();
    }

    @BeforeClass
    public void setUpClass() {
        setupGeneric();
    }

    @BeforeMethod
    public void setUp() {

    }

    @BeforeGroups(groups = {"calculator"})
    public void setUpGroups() {
        setupGeneric();
    }

    @BeforeTest
    public void setUpTest(final ITestContext testContext) {
        this.testContext = testContext;
    }

    @Test(testName = "Substaction", groups = {"calculator"})
    public void test01(Method method) {

        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        ExtentTest mytest = extent.createTest(method.getName());
        Assert.assertEquals(12, c.compute(18, 6, "-"), "Subtraction failed");
        mytest.log(Status.PASS, "test finished");

    }


    @Test(testName = "SubtractionNegatives", groups = {"calculator"})
    public void test02() {
        ExtentTest mytest = extent.createTest("SubtractionNegatives");
        Assert.assertEquals(5, c.compute(3, -2, "-"), "Subtraction failed.");
        mytest.log(Status.PASS, "test finished");
        mytest.pass("finished");
    }

    @Test(testName = "Multiplication", groups = {"calculator"})
    public void test03(Method method) {

        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        ExtentTest mytest = extent.createTest(method.getName());
        Assert.assertEquals(20, c.compute(5, 4, "*"), "Multiplication failed");
        mytest.log(Status.PASS, "test finished");

    }
    @Test(testName = "Division", groups = {"calculator"})
    public void test04(Method method) {

        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        ExtentTest mytest = extent.createTest(method.getName());
        Assert.assertEquals(5, c.compute(25, 5, "/"), "Division failed");
        mytest.log(Status.PASS, "test finished");

    }
    @Test(testName = "SQUAREROOT", groups = {"calculator"})
    public void test05(Method method) {

        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        ExtentTest mytest = extent.createTest(method.getName());
        Assert.assertEquals(6, c.compute(36, 6, "SQRT"), "SQRT failed");
        mytest.log(Status.PASS, "test finished");

    }
    @Test(testName = "Subtraction DataProvider", groups = {"calculator"}, dataProvider = "calculatorDataProvider")
    public void test06(double exp, double d1, double d2, String op, String message) {
        ExtentTest mytest = extent.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
        Assert.assertEquals(exp, c.compute(d1, d2, op), message);
        mytest.pass("test finished");

    }

    @Test(testName = "Multiplication DataProvider", groups = {"calculator"}, dataProvider = "calculatormultDataProvider")
    public void test07(double exp, double d1, double d2, String op, String message) {
        ExtentTest mytest = extent.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
        Assert.assertEquals(exp, c.compute(d1, d2, op), message);
        mytest.pass("test finished");
    }
    @Test(testName = "Division DataProvider", groups = {"calculator"}, dataProvider = "calculatordivDataProvider")
    public void test08(double exp, double d1, double d2, String op, String message) {
        ExtentTest mytest = extent.createTest(new Object() {
        }.getClass().getEnclosingMethod().getName());
        Assert.assertEquals(exp, c.compute(d1, d2, op), message);
        mytest.pass("test finished");
    }


    private void cleanUpGeneric() {
        extent.flush();
    }

    @AfterSuite
    public void afterSuite() {
        cleanUpGeneric();
    }

    @AfterClass
    public void afterClass() {
        cleanUpGeneric();
    }

    @AfterGroups(groups = {"addition", "calculator"})
    public void afterGroups() {
        cleanUpGeneric();
    }
}
