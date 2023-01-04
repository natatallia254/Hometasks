import Lesson_10.Diary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class DiaryTestCase {
    private WebDriver driver;
    private Diary diary;

    @BeforeClass
    public void beforeDiaryTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://diary.ru/user/registration");
        diary = new Diary(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //неявное ожидание
    }

    @Test
    public void DiaryTest(){
        diary.enterUserAndEmail("natallia7539764","natallia7539731@yandex.ru");
        diary.checkCheckBox();
        diary.clickButton();
        Assert.assertTrue(diary.avatarVisible());
    }

    @AfterClass
    public void afterDiaryTest(){
        driver.quit();
    }
}