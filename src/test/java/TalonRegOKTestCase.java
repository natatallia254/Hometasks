import Lesson_14.TalonRegOK;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TalonRegOKTestCase {
    private WebDriver driver;
    private TalonRegOK talonregok;

    @BeforeClass
    public void beforeTalonRegOKTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://talon.by");
        talonregok = new TalonRegOK(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //неявное ожидание загрузки элементов
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));  //неявное ожидание загрузки страницы
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Регистрация через OK.ru")
    public void talonRegOKTest() {
        talonregok.SignInClick();
        talonregok.OKbuttonClick();
        talonregok.SignInOK("natallia254@yandex.ru", "bna_nata1985");
        talonregok.PatientVisible();
    }

    @AfterClass
    public void afterTalonRegOKTest() {
        driver.quit();
    }

}
