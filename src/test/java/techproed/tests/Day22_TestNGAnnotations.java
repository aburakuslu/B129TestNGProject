package techproed.tests;

import org.testng.annotations.*;

public class Day22_TestNGAnnotations {
    /*
    @Test: Test case olusturmak icin kullanilir.
    @Before ve @After: 5 Before ve 5 After annotation bulunur.
    suite > tests > group > class > method
    @BeforeSuite: Her bir test suite'inden once bir kez calisir.
    @AfterSuite: Her bir test suitinden sonra bir kez çalışır.
    @BeforeTest: Her bir test oncesi bir kez çalışır. (Her bir test case öncesi değil!!!)
    @AfterTest: Her bir test sonrası bir kez çalışır.(Her bir test case sonrası değil!!!)
    @BeforeGroups: Belirtilmiş herhangi bir grup öncesi çalışır.
    @AfterGroups: Belirtilmiş herhangi bir grup sonrası çalışır.
    @BeforeClass: Herbir class'tan önce bir kez çalışır.
    @AfterClass: Herbir class'tan sonra bir kez çalışır.
    @BeforeMethod: He bir @Test  annotation'ı öncesi bir kez çalışır.(JUnit @Before annotation'ı gibi)
    @AfterMethod: Her bir @Test  annotation'ı sonrası bir kez çalışır.(JUnit @After annotation'ı gibi)

     */

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeGroups(groups = "regression test")
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @AfterGroups(groups = "regression test")
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Test(groups = "regression test")
    public void test03(){
        System.out.println("test03");
    }
    @Test
    public void test04(){
        System.out.println("test04");
    }
    @Test(groups = "regression test")
    public void test05(){
        System.out.println("test05");
    }
    @Test
    public void test06(){
        System.out.println("test06");
    }
    @Test
    public void test07(){
        System.out.println("test07");
    }
}
