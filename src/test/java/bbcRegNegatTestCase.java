import Lesson_12.bbcReg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import static java.lang.Thread.sleep;

public class bbcRegNegatTestCase {
    private WebDriver driver;
    private bbcReg bbcregnegat;

    @BeforeClass
    public void beforeBbcRegNegatTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbc.com");
        bbcregnegat = new bbcReg(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //неявное ожидание загрузки элементов
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));  //неявное ожидание загрузки страницы
        driver.manage().window().maximize();
    }

    @Test
    public void bbcRegNegatTest() throws InterruptedException {
        //sleep(1000);
        bbcregnegat.signInClick();
        sleep(1000);
        bbcregnegat.regNowClick();
        sleep(1000);
        bbcregnegat.ageButtClick();
        //sleep(1000);
        bbcregnegat.dateBirthEnter("20", "07", "2021");
        //sleep(1000);
        Assert.assertTrue(bbcregnegat.refuseVisible());
    }

    @AfterClass
    public void afterBbcRegNegatTest(){
        driver.quit();
    }
}
