package Lesson_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class bbcTestNegat {
    private WebDriver driver;

    public void SettinDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");   //указываем расположение драйвера
        driver = new ChromeDriver();   //создаем экземпляр драйвера
        driver.get("https://www.bbc.com/");   //заходим на страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //неявное ожидание
        driver.manage().window().maximize();   //максимальное окно
    }

    public void bbcNegRegistration(String day, String month, String year) throws InterruptedException {
        try {
            sleep(2000);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //неявное ожидание
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   //для явного ожидания
            WebElement SignIn = driver.findElement(By.xpath("//a[@id='idcta-link']"));

            System.out.println("Test is beginning...");

            if (SignIn.isEnabled()) {
                SignIn.click();   //нажимаем "SignIn", если доступно
            }

            //wait.until(ExpectedConditions.urlToBe("https://account.bbc.com/signin?realm=%2F&clientId=Account&context=homepage&ptrt=https%3A%2F%2Fwww.bbc.com%2F&userOrigin=HOMEPAGE_GNL&isCasso=false&action=sign-in&redirectUri=https%3A%2F%2Fsession.bbc.com%2Fsession%2Fcallback%3Frealm%3D%2F&service=IdSignInService&nonce=VrBySJ7W-bIco1qIsINRNwlQ4UrZUIJxf-cw"));

            WebElement RegisterNow = driver.findElement(By.xpath("//span[text()='Register now']"));
            if (RegisterNow.isEnabled()) {
                RegisterNow.click();   //нажимаем "RegisterNow", если доступно
            }

            WebElement Age = driver.findElement(By.xpath("//a[@class='sb-link-button sb-link-button--primary sb-link-button--full-width sb-link-button--no-hover-underline']/child::span[text()='16 or over']"));
            sleep(1000);
            if (Age.isEnabled()) {
                Age.click();   //нажимаем "16 or over", если доступно
            }

            WebElement Day = driver.findElement(By.xpath("//input[@id='day-input']"));
            sleep(1000);
            Day.click();
            Day.clear();
            Day.sendKeys(day);

            WebElement Month = driver.findElement(By.xpath("//input[@id='month-input']"));
            Month.click();
            Month.clear();
            Month.sendKeys(month);

            WebElement Year = driver.findElement(By.xpath("//input[@id='year-input']"));
            Year.click();
            Year.clear();
            Year.sendKeys(year);

            WebElement Continue = driver.findElement(By.xpath("//span[text()='Продолжить']"));
            if (Continue.isEnabled()) {
                Continue.click();   //нажимаем "Продолжить", если доступно
            }

            System.out.println("The end. Test is successful");


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sleep(5000);
            driver.quit();
        }
    }

}

