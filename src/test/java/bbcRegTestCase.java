import Lesson_10.Diary;
import Lesson_12.bbcReg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class bbcRegTestCase {
    private WebDriver driver;
    private bbcReg bbcreg;

    @BeforeClass
    public void beforeBbcRegTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbc.com");
        bbcreg = new bbcReg(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //неявное ожидание загрузки элементов
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));  //неявное ожидание загрузки страницы
        driver.manage().window().maximize();
    }

    @Test
    public void bbcRegTest() throws InterruptedException {
        //sleep(1000);
        bbcreg.signInClick();
        sleep(1000);
        bbcreg.regNowClick();
        sleep(1000);
        bbcreg.ageButtClick();
        //sleep(1000);
        bbcreg.dateBirthEnter("25", "05", "2003");
        //sleep(1000);
        bbcreg.registration("tggfgjhkj@yandex.ru", "45y4hhrghh55");
        //sleep(1000);
        bbcreg.OKregistrated();
        //sleep(1000);
        Assert.assertTrue(bbcreg.YourAccountVisible());
    }

    @AfterClass
    public void afterBbcRegTest(){
        driver.quit();
    }

}
