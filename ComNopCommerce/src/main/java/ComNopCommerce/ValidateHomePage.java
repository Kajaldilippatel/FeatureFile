package ComNopCommerce;

import org.testng.asserts.SoftAssert;

public class ValidateHomePage extends Utils {
    public  void validateHomePage(String str1){
        String str2=driver.getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(str1,str2,"Test " + str1 + "Case pass");
        driver.navigate().back();
        softAssert.assertAll();

    }
}
