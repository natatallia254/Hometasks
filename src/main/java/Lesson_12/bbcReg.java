package Lesson_12;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static java.lang.Thread.sleep;

public class bbcReg {
    private WebDriver driver;

    @FindBy(xpath = "//a[@id='idcta-link']")
    private WebElement signIn;

    @FindBy(xpath = "//span[text()='Register now']")
    private WebElement regNow;

    @FindBy(xpath = "//a[@class='sb-link-button sb-link-button--primary sb-link-button--full-width sb-link-button--no-hover-underline']/child::span[text()='16 or over']")
    private WebElement ageButt;

    @FindBy(xpath = "//input[@id='day-input']")
    private WebElement dayField;

    @FindBy(xpath = "//input[@id='month-input']")
    private WebElement monthField;

    @FindBy(xpath = "//input[@id='year-input']")
    private WebElement yearField;

    @FindBy(xpath = "//span[text()='Продолжить']")
    private WebElement continueButt;

    @FindBy(xpath = "//div[@class='field__input-container']/child::input[@id='user-identifier-input']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password-input']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='submit-button']/child::span[text()='Зарегистрироваться']")
    private WebElement registrButt;

    @FindBy(xpath = "//div[@class='button__text']/child::span[text()='Спасибо, нет']")
    private WebElement withoutLetterButt;

    @FindBy(xpath = "//button[@id='submit-button' and text()='Continue']")
    private WebElement contNextButt;

    @FindBy(xpath = "//span[@id='idcta-username' and text()='Your account']")
    private WebElement yourAccount;

    @FindBy(xpath = "//span[text()='Извините, этот пароль недействителен']")
    private WebElement notification;

    @FindBy(xpath = "//span[text()='Sorry, you need to be 16 or over.']")
    private WebElement refuse;

    public bbcReg(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public bbcReg signInClick() {
        signIn.click();
        return this;
    }

    public bbcReg regNowClick() throws InterruptedException {
        sleep(1000);
        regNow.click();
        return this;
    }

    public bbcReg ageButtClick() throws InterruptedException {
        sleep(1000);
        ageButt.click();
        return this;
    }

    public bbcReg dateBirthEnter(String day, String month, String year) throws InterruptedException {
        sleep(1000);
        dayField.clear();
        dayField.sendKeys(day);
        monthField.clear();
        monthField.sendKeys(month);
        yearField.clear();
        yearField.sendKeys(year);
        continueButt.click();
        return this;
    }

    public bbcReg registration(String email, String password) throws InterruptedException {
        sleep(1000);
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        registrButt.click();
        return this;
    }

    public bbcReg OKregistrated() throws InterruptedException {
        sleep(1000);
        withoutLetterButt.click();
        contNextButt.click();
        return this;
    }

    public boolean YourAccountVisible() {
        return yourAccount.isDisplayed();
    }

    public boolean notificationVisible() {
        return notification.isDisplayed();
    }

    public boolean refuseVisible() {
        return refuse.isDisplayed();
    }

}
