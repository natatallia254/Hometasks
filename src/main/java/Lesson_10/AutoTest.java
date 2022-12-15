package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static java.lang.Thread.sleep;

public class AutoTest {
    private WebDriver driver;

    public void Settings() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");   //указываем расположение драйвера
        driver = new ChromeDriver();   //создаем экземпляр драйвера
        driver.get("https://diary.ru/user/registration");   //заходим на страницу
        driver.manage().window().maximize();   //максимальное окно
    }

    public void Registration(String user,String mail) throws InterruptedException {
        try {
            Thread.sleep(2000);   //засыпание, чтобы все загрузилось
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   //для явного ожидания
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //неявное ожидание
            WebElement userInput = driver.findElement(By.xpath("//input[@id='signupform-username']"));
            //WebElement passwInput = driver.findElement(By.xpath("//input[@id='signupform-password']"));
            WebElement mailInput = driver.findElement(By.xpath("//input[@id='signupform-email']"));
            WebElement checkBox = driver.findElement(By.xpath("//input[@id='chk_box_user_confirm']"));
            WebElement button = driver.findElement(By.xpath("//button[@id='signup_btn']"));

            System.out.println("Please wait...");
            userInput.click();
            userInput.clear();
            userInput.sendKeys(user);
            mailInput.click();
            mailInput.clear();
            mailInput.sendKeys(mail);
            if (!checkBox.isSelected()) {
                checkBox.click();   //если checkbox не нажат - кликаем его
            }
            if (button.isEnabled()) {
                button.click();   //нажимаем кнопку "Зарегистрироваться", если она доступна
            }
            //button.click();
            wait.until(ExpectedConditions.urlToBe("https://diary.ru/new"));   //ждем 10 сек. (выше), чтобы прогрузилась след. страница
            System.out.println("The end. Test is successful");

            /*String window_new = driver.getCurrentUrl();
            String window_old = "https://diary.ru/new";
            //System.out.println(window_new);
            if (window_new == window_old) {
               System.out.println("Test is success!");
            } else {
                System.out.println("Test is failed");
            }*/

            /*if (Objects.equals(driver.getCurrentUrl(), "https://diary.ru/new")) {
                System.out.println("Test is successful!");
            } else {
                System.out.println("Test is failed");
            }*/

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sleep(3000);
            driver.quit();
        }
    }


}