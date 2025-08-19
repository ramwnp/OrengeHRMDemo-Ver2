package stepDefinitions;

import PageObjects.My_InfoPage;
import PageObjects.OrengeHRMLoginPage;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps extends Base {

    @Given("User Launch Crome browser")
    public void user_Launch_Crome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        olp = new OrengeHRMLoginPage(driver);
    }

    @When("user opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("user enters userName as {string} and password as {string}")
    public void user_enters_userName_as_and_password_as(String userName, String pwd) {
        olp.setUserName(userName);
        olp.setPassword(pwd);
    }

    @When("Click on Login")
    public void click_on_Login() {
        olp.clickLogin();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String title) {
        if (driver.getPageSource().contains("Invalid credentials")) {
            driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }
    }

    @Then("Click on userDrodown link")
    public void click_on_userDrodown_link() {
        olp.clickuserDrodown();
    }

    @When("user click on Logout link")
    public void user_click_on_Logout_link() {
        olp.logout();
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

    //My_info module step definitin methods

    @Then("click on My_info module")
    public void click_on_My_info_module() {
        my_infoPage = new My_InfoPage(driver);
        my_infoPage.click_on_My_info_module();
    }

    @Then("user enter Employee info")
    public void user_enter_Employee_info() {
        System.out.println("@#@@@@@@@@@@@@@@@@@@@@"+my_infoPage);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //my_infoPage.setFirstName("aaaaa");
        //my_infoPage.setLastName("bbbbb");
        my_infoPage.setlicenseExpiryDate("");
    }
    @Then("click on save button")
    public void click_on_save_button() {

    }

    @Then("user can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {

    }
}
