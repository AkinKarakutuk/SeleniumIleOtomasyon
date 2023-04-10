import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    //WebDriver bir selenium kütüphanesidir.
    //kullanacağımız tarayıcı ile ilgili nesne oluşturuyoruz.
    //WebDriver selenium un ana sınıfıdır ve pek çok özelliği
    //WebDriver içerisinden kullanırız.
    WebDriver driver;

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void hepsiBuradaLoginTesti() throws InterruptedException{

        driver.get("https://www.hepsiburada.com");

        driver.findElement(By.id("myAccount")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        //Belirli bir içeriği sendKeys() metodu kullanarak
        //göndeririz.
        driver.findElement(By.id("txtUserName")).sendKeys("seleniumOtomasyonu@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("btnLogin")).click();
    }

    @AfterEach
    void tearDown(){
        driver.close();
    }
}
