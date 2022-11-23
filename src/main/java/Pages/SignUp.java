package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
    private WebDriver driver;
    By name=By.xpath("//*[@id=\"signup-form\"]/div[1]/div/input");
    By store=By.name("store_name");
    By check=By.xpath("//*[@id=\"signup-form\"]/div[3]/label/span");
    By phone=By.name("mobile_number");
    By Email=By.name("email");
    By Password=By.name("password");
    By ConfirmPassword=By.name("rpassword");
    By Button=By.id("register-submit-btn");
    By Login=By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[2]/a");

    // WebDriverWait w = new WebDriverWait(driver,60);
    public SignUp(WebDriver driver){
        this.driver=driver;
    }


    public String SignupWithCommercialRegisterAndTaxCard() {
        driver.findElement(name).sendKeys("name");
        driver.findElement(store).sendKeys("store");
        driver.findElement(check).click();
        driver.findElement(phone).sendKeys("01234567891");
        driver.findElement(Email).sendKeys("d13@domain.xyz");
        driver.findElement(Password).sendKeys("123456aA@");
        driver.findElement(ConfirmPassword).sendKeys("123456aA@");
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);

        wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("h3")));
        String title = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/h3")).getText();

        return title;
    }

    public String SignUpWithoutCommercialRegisterAndTaxCard(){
        driver.findElement(name).sendKeys("name");
        driver.findElement(store).sendKeys("store");
        driver.findElement(phone).sendKeys("01234567891");
        driver.findElement(Email).sendKeys("d35@domain.xyz");
        driver.findElement(Password).sendKeys("123456aA@");
        driver.findElement(ConfirmPassword).sendKeys("123456aA@");
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("h3")));
        String title = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/h3")).getText();

        return title;
    }
    public String CheckLogin(){
        driver.findElement(Login).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("h2")));
        String title=driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h2")).getText();
        return title;
    }
    public String SignUpWithEmptyFields(){
        driver.findElement(Button).click();
        String title=driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h2")).getText();
        return title;
    }
    public String SignUpWithoutName(){
        driver.findElement(store).sendKeys("store");
        driver.findElement(phone).sendKeys("01234567891");
        driver.findElement(Email).sendKeys("d3@domain.xyz");
        driver.findElement(Password).sendKeys("123456aA@");
        driver.findElement(ConfirmPassword).sendKeys("123456aA@");
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")));
        String title = driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")).getText();

        return title;
    }
    public String SignUpWithoutStoreName(){
        driver.findElement(name).sendKeys("name");
        driver.findElement(phone).sendKeys("01234567891");
        driver.findElement(Email).sendKeys("d3@domain.xyz");
        driver.findElement(Password).sendKeys("123456aA@");
        driver.findElement(ConfirmPassword).sendKeys("123456aA@");
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")));
        String title = driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")).getText();

        return title;
    }
    public String InvalidPhoneFormat(String Dname,String DStorename,String DPhone,String DEmail,String DPassword,String DRPassword){
        driver.findElement(name).sendKeys(Dname);
        driver.findElement(store).sendKeys(DStorename);
        driver.findElement(phone).sendKeys(DPhone);
        driver.findElement(Email).sendKeys(DEmail);
        driver.findElement(Password).sendKeys(DPassword);
        driver.findElement(ConfirmPassword).sendKeys(DRPassword);
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("h6")));
        String title = driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")).getText();

        return title;
    }
    public String InvalidEmailFormat(String Dname,String DStorename,String DPhone,String DEmail,String DPassword,String DRPassword){
        driver.findElement(name).sendKeys(Dname);
        driver.findElement(store).sendKeys(DStorename);
        driver.findElement(phone).sendKeys(DPhone);
        driver.findElement(Email).sendKeys(DEmail);
        driver.findElement(Password).sendKeys(DPassword);
        driver.findElement(ConfirmPassword).sendKeys(DRPassword);
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("h6")));
        String title = driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")).getText();

        return title;
    }
    public String SignUpWithExstingEmail(){
        driver.findElement(name).sendKeys("name");
        driver.findElement(store).sendKeys("store");
        driver.findElement(phone).sendKeys("01234567891");
        driver.findElement(Email).sendKeys("d@domain.xyz");
        driver.findElement(Password).sendKeys("123456aA@");
        driver.findElement(ConfirmPassword).sendKeys("123456aA@");
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")));
        String title = driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div/div[2]/div[1]/h6")).getText();

        return title;
    }
    public String InvalidPasswordFormat (String Dname,String DStorename,String DPhone,String DEmail,String DPassword,String DRPassword){
        driver.findElement(name).sendKeys(Dname);
        driver.findElement(store).sendKeys(DStorename);
        driver.findElement(phone).sendKeys(DPhone);
        driver.findElement(Email).sendKeys(DEmail);
        driver.findElement(Password).sendKeys(DPassword);
        driver.findElement(ConfirmPassword).sendKeys(DRPassword);
        driver.findElement(Button).click();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//*[@id=\"signup-form\"]/div[6]/div/div/ul/li[1]")));
        String title = driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[6]/div/div/ul/li[1]")).getText();

        return title;
    }

    public String DismatchPasswordFormat (String Dname,String DStorename,String DPhone,String DEmail,String DPassword,String DRPassword){
        driver.findElement(name).sendKeys(Dname);
        driver.findElement(store).sendKeys(DStorename);
        driver.findElement(phone).sendKeys(DPhone);
        driver.findElement(Email).sendKeys(DEmail);
        driver.findElement(Password).sendKeys(DPassword);
        driver.findElement(ConfirmPassword).sendKeys(DRPassword);
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//*[@id=\"r-register-password-error\"]")));
        String title = driver.findElement(By.xpath("//*[@id=\"r-register-password-error\"]")).getText();

        return title;
    }
    }