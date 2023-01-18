package Lesson_14;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class TalonRegVK {
    private WebDriver driver;

    @FindBy(xpath = "//a[@class='color' and @href='/login' and text()='Войти']")
    private WebElement signIn;

    @FindBy(xpath = "//a[@class='vkontakte' and @href='https://talon.by/connect/vkontakte']")
    private WebElement VKbutton;

    @FindBy(xpath = "//a[@class='odnoklassniki' and @href='https://talon.by/connect/odnoklassniki']")
    private WebElement OKbutton;

    @FindBy(xpath = "//a[@class='facebook' and @href='https://talon.by/connect/facebook']")
    private WebElement FBbutton;

    @FindBy(xpath = "//a[@class='google' and @href='https://talon.by/connect/google']")
    private WebElement GOOGLEbutton;

    @FindBy(xpath = "//a[@class='mailru' and @href='https://talon.by/connect/mailru']")
    private WebElement MailRUbutton;

    @FindBy(xpath = "//input[@class='oauth_form_input dark' and @name='email']")
    private WebElement VKemail;

    @FindBy(xpath = "//input[@class='oauth_form_input dark' and @name='pass']")
    private WebElement VKpassword;

    @FindBy(xpath = "//button[@class='flat_button oauth_button button_wide' and @id='install_allow' and text()='Войти']")
    private WebElement VKsignIn;

    //@FindBy(xpath = "//button[@class='flat_button fl_r button_indent' and @onclick='return allow(this);']")
    //private WebElement VKagree;

    @FindBy(xpath = "//span[@id='openListPatient']")
    private WebElement OKlistPatient;

    public TalonRegVK(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public TalonRegVK SignInClick() {
        signIn.click();
        return this;
    }

    public TalonRegVK AllButtClick() {
        Actions builder = new Actions(driver);
        builder
                .keyDown(Keys.CONTROL)
                .click(VKbutton)
                .pause(1000)
                .click(OKbutton)
                .pause(1000)
                .click(FBbutton)
                .pause(1000)
                .click(GOOGLEbutton)
                .pause(1000)
                .click(MailRUbutton)
                .pause(1000)
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
        return this;
    }

    public TalonRegVK SignInVK(String email, String password) {
        String title = "ВКонтакте | Вход";
        //String title_ = "Вход в личный кабинет | Талон.бай";
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
        VKemail.clear();
        VKemail.sendKeys(email);
        VKpassword.clear();
        VKpassword.sendKeys(password);
        VKsignIn.click();
        return this;
    }

    /*public TalonRegVK VKagreeClick() {
        VKagree.click();
        return this;
    }*/

    public boolean PatientVisible() {
        return OKlistPatient.isDisplayed();
    }

}
