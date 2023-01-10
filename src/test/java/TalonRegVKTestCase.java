import Lesson_14.TalonRegVK;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TalonRegVKTestCase {
    private WebDriver driver;
    private TalonRegVK talonregvk;

    @BeforeClass
    public void beforeTalonRegVKTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://talon.by");
        talonregvk = new TalonRegVK(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //неявное ожидание загрузки элементов
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  //неявное ожидание загрузки страницы
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Открытие всех ресурсов для регистрации на Talon.by и последующая регистрация через VK.com")
    public void talonRegVKTest() {
        talonregvk.SignInClick();
        talonregvk.AllButtClick();
        talonregvk.SignInVK("natallia254@yandex.ru", "bna_nata1985");
        talonregvk.VKagreeClick();
    }

    @AfterClass
    public void afterTalonRegVKTest() {
        driver.quit();
    }

}
