package Lesson_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class TalonRegOK {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/login' and @class='color' and text()='Войти']")
    private WebElement signIn;

    @FindBy(xpath = "//a[@class='odnoklassniki' and @href='https://talon.by/connect/odnoklassniki']")
    private WebElement OKbutton;

    @FindBy(xpath = "//input[@id='field_email' and @tabindex='1']")
    private WebElement OKemail;

    @FindBy(xpath = "//input[@id='field_password' and @tabindex='2']")
    private WebElement OKpassword;

    @FindBy(xpath = "//input[@type='submit' and @tabindex='3' and @value='Войти']")
    private WebElement OKsignIn;

    //@FindBy(xpath = "//a[@href='/logout' and @class='exit' and @title='Выход']")
    //private WebElement OKlogout;

    @FindBy(xpath = "//span[@id='openListPatient']")
    private WebElement OKlistPatient;

    public TalonRegOK(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public TalonRegOK SignInClick() throws InterruptedException {
        //sleep(1000);
        signIn.click();
        return this;
    }

    public TalonRegOK OKbuttonClick() throws InterruptedException {
        //sleep(1000);
        OKbutton.click();
        return this;
    }

    public TalonRegOK SignInOK(String email, String password) throws InterruptedException {
        //sleep(1000);
        OKemail.clear();
        OKemail.sendKeys(email);
        OKpassword.clear();
        OKpassword.sendKeys(password);
        OKsignIn.click();
        return this;
    }

    public boolean PatientVisible() {
        return OKlistPatient.isDisplayed();
    }

}
