package Base;
import Pages.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class BaseTests {
    private WebDriver driver;
    protected SignUp signUp;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://merchant.kashier.io/signup");
        // driver.manage().window().fullscreen();
        signUp=new SignUp(driver);


    }
    @AfterMethod
    public void terminate(){
        driver.close();


    }
}
