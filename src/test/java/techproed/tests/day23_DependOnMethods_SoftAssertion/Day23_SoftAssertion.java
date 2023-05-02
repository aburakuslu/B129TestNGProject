package techproed.tests.day23_DependOnMethods_SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Day23_SoftAssertion {

    @Test
    public void softAssertTest() {

        //Soft Assertion yapabilmek icin 3 adim izliyoruz:
        //1. Adim: Soft Assert objesi olusturun:
        SoftAssert softAssert = new SoftAssert();

        //2.Adim: Assertion yapin:
        //a. Assertion
        softAssert.assertEquals(1, 2);//Soft assertion kullanildigi icin test fail olsa bile Java calismayi durdurmaz
        System.out.println("Assertion 1 calisti");

        //b. Assertion
        softAssert.assertTrue("Selenium".contains("a"));//Ustteki assertion fail oldu fakat bu assertion'da calisti.
        // Cunku soft assertion kullanildigindan, calismayi durdurmadi.
        System.out.println("Assertion 2 calisti");

        //c. Assertion
        softAssert.assertTrue(false);
        System.out.println("Assertion 3 çalıştı");


        //3. Adim: assertAll() method'unu calistirin:
        softAssert.assertAll();

        System.out.println("Hello");//Bu kod çalışmayacak.
        // Çünkü assertAll() methodu fail durumunda assertionlar sonrası çalışmayı durdurur.

    }
}
