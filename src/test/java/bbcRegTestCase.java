import Lesson_10.Diary;
import Lesson_12.bbcReg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //неявное ожидание
    }

    @Test
    public void bbcRegTest(){
        bbcreg.signInClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        bbcreg.regNowClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        bbcreg.ageButtClick();
        //Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        bbcreg.dateBirthEnter("25", "05", "2003");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        bbcreg.registration("tgyyhduah@yandex.ru", "454dwdbhb55");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        bbcreg.OKregistrated();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(bbcreg.YourAccountVisible());
    }

    @AfterClass
    public void afterBbcRegTest(){
        driver.quit();
    }

}
