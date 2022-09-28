package stepDefinition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.PageFactory;

public class BaseCLass {
    static WebDriver driver;
    public PageFactory pageFactory;

    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        pageFactory = new PageFactory(driver);
    }

    public void close() {
        driver.close();
    }
}

