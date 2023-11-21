package Cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
public class ZaliczenieSteps {

    WebDriver webDriver;
    WebDriverWait wait;

    @Before
    public void IOpenABrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 3);
    }

    @Given("I go to login page")
    public void iGoToLoginPage() {
        webDriver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @When("I type {string} email and {string} password and clic login button")
    public void iTypeEmailAndPasswordAndClicLoginButton(String email, String password) {
        WebElement element = webDriver.findElement(By.id("field-email"));
        element.sendKeys(email);
        webDriver.findElement(By.id("field-password")).sendKeys(password);
        webDriver.findElement(By.id("submit-login")).click();

    }

    @Then("I go to addresses page and create new adress by typing {string} alias, {string} address, {string} city, {string} zip,{string} country, {string} phone")
    public void iGoToAddressesPageAndCreateNewAddressByTypingAliasAddressCityZipCountryPhone(String alias, String address, String city, String zip, String country, String phone) {
        webDriver.findElement(By.id("addresses-link")).click();
        webDriver.findElement(By.xpath("//span[.= 'Create new address']")).click();
        webDriver.findElement(By.id("field-alias")).sendKeys(alias);
        webDriver.findElement(By.id("field-address1")).sendKeys(address);
        webDriver.findElement(By.id("field-city")).sendKeys(city);
        webDriver.findElement(By.id("field-postcode")).sendKeys(zip);
        webDriver.findElement(By.id("field-id_country")).sendKeys(country);
        webDriver.findElement(By.id("field-phone")).sendKeys(phone);
        webDriver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    @And("I check the correctness of the data")
    public void iCheckTheCorrectnessOfTheData() {
        String aliasOnPage = webDriver.findElement(By.id("field-alias")).getText();
       // String addressOnPage = webDriver.findElement(By.id("field-address1")).getText();
      //  String cityOnPage = webDriver.findElement(By.id("field-city")).getText();
      //  String zipOnPage = webDriver.findElement(By.id("field-postcode")).getText();
     //   String countryOnPage = webDriver.findElement(By.id("field-id_country")).getText();
      //  String phoneOnPage = webDriver.findElement(By.id("field-phone")).getText();

        String expectedText1 = "AnnSzy";
        Assert.assertTrue(aliasOnPage.contains(expectedText1));


    }


}
