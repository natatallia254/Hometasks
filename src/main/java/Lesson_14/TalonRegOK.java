package Lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class TalonRegOK {
    private WebDriver driver;
    public void TalonRegOKTest(String email, String pass) throws InterruptedException {
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

            WebElement OK = driver.findElement(By.xpath("//a[@class='odnoklassniki' and @href='https://talon.by/connect/odnoklassniki']"));
            OK.click();

            WebElement OKemail = driver.findElement(By.xpath("//input[@id='field_email' and @tabindex='1']"));
            WebElement OKpassword = driver.findElement(By.xpath("//input[@id='field_password' and @tabindex='2']"));
            WebElement OKSignIn = driver.findElement(By.xpath("//input[@type='submit' and @tabindex='3' and @value='Войти']"));
            OKemail.click();
            OKemail.clear();
            OKemail.sendKeys(email);
            OKpassword.click();
            OKpassword.clear();
            OKpassword.sendKeys(pass);

            if (OKSignIn.isEnabled()) {
                OKSignIn.click();   //нажимаем "OKSignIn", если доступно
            }

            Thread.sleep(1000);

            /*WebElement OKagreement = driver.findElement(By.xpath("//button[@name='button_accept_request' and text()='Разрешить']"));
            if (OKagreement.isEnabled()) {
                OKagreement.click();   //нажимаем "OKagreement", если доступно
            }*/

            WebElement OKopenList = driver.findElement(By.xpath("//span[@id='openListPatient']"));
            WebElement OKlogout = driver.findElement(By.xpath("//a[@href='/logout' and @class='exit']"));
            if (OKopenList.isEnabled()) {
                OKopenList.click();   //нажимаем "OKopenList", если доступно
            }
            OKlogout.click();

            WebElement SignIn2 = driver.findElement(By.xpath("//a[@class='color' and @href='/login' and text()='Войти']"));

            if (SignIn2.isEnabled()) {
                SignIn2.click();   //нажимаем "SignIn", если доступно
            }

            WebElement OK2 = driver.findElement(By.xpath("//a[@class='odnoklassniki' and @href='https://talon.by/connect/odnoklassniki']"));
            OK2.click();

            System.out.println("The end. Test is successful");

        }  finally {
            sleep(2000);
            driver.quit();
        }
    }

}
