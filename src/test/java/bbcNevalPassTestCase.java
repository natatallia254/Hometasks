import Lesson_12.bbcReg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class bbcNevalPassTestCase {
    private WebDriver driver;
    private bbcReg bbcnevalpass;

    @BeforeClass
    public void beforeBbcNevalPassTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbc.com");
        bbcnevalpass = new bbcReg(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //неявное ожидание загрузки элементов
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));  //неявное ожидание загрузки страницы
        driver.manage().window().maximize();
    }

    @Test
    public void bbcNevalPassTest() throws InterruptedException {
        //sleep(1000);
        bbcnevalpass.signInClick();
        sleep(1000);
        bbcnevalpass.regNowClick();
        sleep(1000);
        bbcnevalpass.ageButtClick();
        //sleep(1000);
        bbcnevalpass.dateBirthEnter("31", "08", "1985");
        //sleep(1000);
        bbcnevalpass.registration("cheburavhvgh@rambler.ru", "11111146456566");
        //sleep(1000);
        Assert.assertTrue(bbcnevalpass.notificationVisible());
    }

    @AfterClass
    public void afterBbcNevalPassTest(){
        driver.quit();
    }
}
