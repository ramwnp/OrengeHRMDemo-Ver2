package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OrengeHRMLoginPage {
    public WebDriver webDriver;
    //here we capture all elements

    By txtUserName = By.xpath("//input[@name='username']");
    By txtPassword = By.xpath("//input[@placeholder='Password']");
    By btnLogin = By.xpath("//button[normalize-space()='Login']");
    By userDrodown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    By lnkLogout = By.linkText("Logout");

    //constructore for initializing the webdriver object
    public OrengeHRMLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        //PageFactory.initElements(webDriver, this);
    }

    //here we will write the action methods

    public void setUserName(String uname) {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(txtUserName).sendKeys(uname);
    }

    public void setPassword(String pwd) {
        webDriver.findElement(txtPassword).sendKeys(pwd);
    }

    public void clickLogin() {
        webDriver.findElement(btnLogin).click();
    }

    public void clickuserDrodown() {
        webDriver.findElement(userDrodown).click();
    }

    public void logout() {
        webDriver.findElement(lnkLogout).click();
    }

    //methods for Dashboard

}
