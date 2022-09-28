package Pages;
import org.openqa.selenium.WebDriver;

public class PageFactory
{
   private HomePage Home;
  private HomePage Homemethod12;

    WebDriver driver;

    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

   public HomePage getHomePage() {
        if (Home == null) {
           Home = new HomePage(driver);
       }
       return Home;
    }
   public HomePage getHomemethod12() {
        if (Homemethod12 == null) {
          Homemethod12 = new HomePage(driver);
       }
        return Homemethod12;
    }
    }

