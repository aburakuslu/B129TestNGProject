package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;

public class C02_BlueRentalExcelTest1 {
    @Test
    public void excelTest() {
        /*
            Eğer bir veriyi(datayı) .properties dosyasından almak istiyorsak, ConfigReader classından getProperty()
        methodunu kullanarak .properties dosyamıza girdiğimiz key değerini belirtiriz ve bize bu key değerinin
        value'sunu döndürür.
            Eğer bir veriri(datayı) excel dosyasından almak istiyorsak, oluşturmuş olduğumuz ExcelUtils class'ındaki
        methodları kullanarak istediğimiz veriyi alabiliriz.
         */
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx", "customer_info");
        String email = excelUtils.getCellData(1, 0);
        String password = excelUtils.getCellData(1, 1);

        //BlueRentalCar adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarUrl"));

        //Excel dosyamizdan aldigimiz ilk email ve password ile sayfaya login olalim
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        //Excel'den aldığımız verileri sendKeys() methodu ile gönderdik

        //login oldugumuzu dogrulayalim
        Assert.assertTrue(blueRentalPage.verify.isDisplayed());
    }
}
