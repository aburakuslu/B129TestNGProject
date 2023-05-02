package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object[][] sehirVerileri() {
        return new Object[][]{{"Istanbul", "Marmara", "34"},
                            {"Diyarbakir", "Guneydogu", "21"},
                            {"Ankara", "Ic Anadolu", "06"}};
    }

    @DataProvider
    public Object[][] kullaniciBilgileri(){

        return new Object[][]{{"Ali", "Ali.123"},
                              {"Ayşe", "Ayse.123"},
                              {"Fatma", "Ftm_987"},
                              {"Veli", "1234"}};
    }

    @DataProvider()
    public Object[][] customerData() {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        //ExcelUtils objesi oluşturarak  getDataArray() methodu ile iki boyutlu String Array'i
        // DataProvider olarak return yapıyoruz.
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();
    }
}
