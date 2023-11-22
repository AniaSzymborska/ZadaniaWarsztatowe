import com.course.selenium.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Zad2StoreTest {

    private WebDriver webDriver;
    private WebDriverWait wait;
    String email;
    Zad2MainPage mainPage;
    Zad2LoginPage loginPage;
    Zad2ProductPage productPage;
    Zad2CartPage cartPage;
    Zad2OrderPage orderPage;
    Zad2ConfirmationPage confirmationPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 5);
        webDriver.manage().window().maximize();
        //webDriver.get("https://prod-kurs.coderslab.pl/index.php?");
        mainPage = new Zad2MainPage(webDriver, wait);
        loginPage = new Zad2LoginPage(webDriver, wait);
        productPage = new Zad2ProductPage(webDriver, wait);
        cartPage = new Zad2CartPage(webDriver, wait);
        orderPage = new Zad2OrderPage(webDriver,wait);
        confirmationPage = new Zad2ConfirmationPage(webDriver,wait);
    }

    @Test
    public void SignInAs() {
        mainPage.openZad2MainPage();
        loginPage.openZad2LoginPage();
        loginPage.signIn("stradlingrad@gmail.com", "RobieZakupy03!");
    }

    @Test
    public void findProduct() {
        mainPage.openZad2MainPage();
        mainPage.findSweater("Hummingbird Printed Sweater");
        productPage.addToCart(5, "M");
        productPage.proceedToCheckout();
        cartPage.openZad2CartPage();
        boolean discountIs20Percent = cartPage.checkDiscount("20%");
        if (discountIs20Percent) {
            System.out.println("Rabat na produkt wynosi 20%");
        } else {
            System.out.println("Rabat na produkt nie wynosi 20%");
        }
        cartPage.proceedToCheckout2();
       // orderPage.confirmData();
        orderPage.confirmAdress();
        orderPage.shippingMethod();
        orderPage.paymentOptions();
        orderPage.conditionsToApprove();
        orderPage.placeOrder();
      //  confirmationPage.screenShot();



    }


}


