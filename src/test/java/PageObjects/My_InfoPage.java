package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_InfoPage {
    public WebDriver webDriver;
    public My_InfoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    By My_info = By.xpath("//span[normalize-space()='My Info']");

    @FindBy(xpath = "//input[@placeholder='First Name']")
    @CacheLookup
    WebElement fNname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    @CacheLookup
    WebElement lastName;

    @FindBy(className = "oxd-input oxd-input--active")
    @CacheLookup
    WebElement employeeId;

    @FindBy(className = "oxd-input oxd-input--active")
    @CacheLookup
    WebElement otherId;

    @FindBy()
    @CacheLookup
    WebElement drivers_License_Number;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement  licenseExpiryDate;

    @FindBy()
    @CacheLookup
    WebElement nationality;

    @FindBy()
    @CacheLookup
    WebElement maritalStatus;

    @FindBy()
    @CacheLookup
    WebElement dateOfBirth;

    @FindBy()
    @CacheLookup
    WebElement Gender;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    @CacheLookup
    WebElement btnSave;

    public void click_on_My_info_module(){
        webDriver.findElement(My_info).click();
    }
    public void setFirstName(String fname){
        fNname.clear();
        //fNname.sendKeys(fname);
    }
    public void setLastName(String lname){
        lastName.clear();
        //lastName.sendKeys(lname);
    }
    public void setEmployeeId(String eId){
        employeeId.clear();
        employeeId.sendKeys(eId);
    }
    public void setOtherIdId(String oId){
        otherId.clear();
        otherId.sendKeys(oId);
    }
    public void setDrivers_License_Number(String dln){
        drivers_License_Number.clear();
        drivers_License_Number.sendKeys(dln);
    }
    public void setlicenseExpiryDate(String lExpiryDate){
        licenseExpiryDate.clear();
        licenseExpiryDate.sendKeys(lExpiryDate);
    }
    public void setNationality(String nlt){
        nationality.clear();
        nationality.sendKeys(nlt);
    }
    public void setMaritalStatus(String mStatus){
        maritalStatus.clear();
        maritalStatus.sendKeys(mStatus);
    }
    public void setdateOfBirth(String dob){
        dateOfBirth.clear();
        dateOfBirth.sendKeys(dob);
    }
    public void setGender(String gen){
        Gender.clear();
        Gender.sendKeys(gen);
    }
}
