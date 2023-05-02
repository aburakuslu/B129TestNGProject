package techproed.tests.day23_DependOnMethods_SoftAssertion;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Day23_DependsOnMethods {
    /*
    Test NG'de @Test method'lari birbirinden bagimsiz calisir.
    Method'lari bagimli calistirmak istiyorsak "dependsOnMethods" parametresi kullanilir.
    Asagida searchTest() method'u homePageTest() method'una baglidir.
    Eger homePageTest() fail olursa searchTest() calismaz, "ignore" edilir.
    Eğer homePageTest() calisirsa seachTest() de calisir.

     */

    @Test
    public void homePageTest() {
        assertEquals(1, 2);//Burada "hard assertion" kullanıldığı için test fail olduğunda
        // Java çalışmayı durdurur ve sonraki kodlar çalışmaz.
        System.out.println("Ana sayfaya gidildi");
    }

    @Test(dependsOnMethods = "homePageTest")
    public void searchTest() {
        System.out.println("Arama yapildi");
    }

    @Test(dependsOnMethods = "homePageTest")
    public void signInTest() {
        System.out.println("Giris yapildi");
    }
}
