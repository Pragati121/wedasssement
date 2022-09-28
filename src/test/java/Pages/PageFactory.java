package Pages;
import org.openqa.selenium.WebDriver;

public class PageFactory
{
   private HomePage Home;
  private HomePage Homemethod12;
    private ElectronicPage Electronic;
    private ElectronicPage Electronics23;

    private ElectronicPage electronics;
    private ElectronicPage electronicsUser;

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
    public ElectronicPage getElectronic() {
        if (Electronic == null) {
            Electronic= new ElectronicPage(driver);
        }
        return Electronic;
    }
    public ElectronicPage getElectronic23() {
        if (Electronics23 == null) {
            Electronics23= new ElectronicPage(driver);
        }
        return Electronics23;
    }
    public ElectronicPage getelectronics() {
        if (electronics == null) {
            electronics= new ElectronicPage(driver);
        }
        return electronics;
    }
    public ElectronicPage getElectronicsUser() {
        if (electronicsUser == null) {
            electronicsUser= new ElectronicPage(driver);
        }
        return electronicsUser;
    }
    }

