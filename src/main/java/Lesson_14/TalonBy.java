package Lesson_14;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Thread.sleep;

public class TalonBy {
    private WebDriver driver;

    public void TalonByTest(String email, String pass) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");   //указываем расположение драйвера
        driver = new ChromeDriver();   //создаем экземпляр драйвера
        driver.get("https://talon.by/");   //заходим на страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //неявное ожидание
        driver.manage().window().maximize();   //максимальное окно

        try {
            System.out.println("Test is beginning...");

            WebElement SignIn = driver.findElement(By.xpath("//a[@class='color' and @href='/login' and text()='Войти']"));

            if (SignIn.isEnabled()) {
                SignIn.click();   //нажимаем "SignIn", если доступно
            }

            WebElement VK = driver.findElement(By.xpath("//a[@class='vkontakte' and @href='https://talon.by/connect/vkontakte']"));
            WebElement OK = driver.findElement(By.xpath("//a[@class='odnoklassniki' and @href='https://talon.by/connect/odnoklassniki']"));
            WebElement FB = driver.findElement(By.xpath("//a[@class='facebook' and @href='https://talon.by/connect/facebook']"));
            WebElement Google = driver.findElement(By.xpath("//a[@class='google' and @href='https://talon.by/connect/google']"));
            WebElement MailRu = driver.findElement(By.xpath("//a[@class='mailru' and @href='https://talon.by/connect/mailru']"));

            Actions builder = new Actions(driver);
            builder
                    .keyDown(Keys.CONTROL)
                    .click(VK)
                    .pause(1000)
                    .click(OK)
                    .pause(1000)
                    .click(FB)
                    .pause(1000)
                    .click(Google)
                    .pause(1000)
                    .click(MailRu)
                    .pause(1000)
                    .keyUp(Keys.CONTROL)
                    .build()
                    .perform();

            Thread.sleep(1000);

            String title = "ВКонтакте | Вход";
            List<String> windowHandles = new ArrayList(driver.getWindowHandles());
            String windowTitle = null;
            for (String window : windowHandles) {
                if (driver.switchTo().window(window).getTitle().equals(title)) {
                    windowTitle = window;
                } else {
                    driver.switchTo().window(window).close();
                  }
            }

            driver.switchTo().window(windowTitle);

            Thread.sleep(1000);

            WebElement VKemail = driver.findElement(By.xpath("//input[@class='oauth_form_input dark' and @name='email']"));
            WebElement VKpassword = driver.findElement(By.xpath("//input[@class='oauth_form_input dark' and @name='pass']"));
            WebElement VKSignIn = driver.findElement(By.xpath("//button[@class='flat_button oauth_button button_wide' and @id='install_allow' and text()='Войти']"));

            VKemail.click();
            VKemail.clear();
            VKemail.sendKeys(email);

            VKpassword.click();
            VKpassword.clear();
            VKpassword.sendKeys(pass);

            if (VKSignIn.isEnabled()) {
                VKSignIn.click();   //нажимаем "VKSignIn", если доступно
            }

            Thread.sleep(2000);

            WebElement VKcancel = driver.findElement(By.xpath("//button[@class='flat_button secondary fl_r' and @onclick='return cancel();']"));
            if (VKcancel.isEnabled()) {
                VKcancel.click();   //нажимаем "VKcancel", если доступно
            }

            System.out.println("The end. Test is successful");
        } finally {
            sleep(5000);
            driver.quit();
        }

    }

}
