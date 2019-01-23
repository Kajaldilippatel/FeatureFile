package ComNopCommerce;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Basepage {

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browser\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
   @After
    public void tearDown() {
    driver.quit();
    }


}

