package Lesson_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Diary {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='signupform-username']")
    private WebElement userField;

    @FindBy(xpath = "//input[@id='signupform-email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='chk_box_user_confirm']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[@id='signup_btn']")
    private WebElement button;

    @FindBy(xpath = "//li[@class='avatar']")
    private WebElement avatar;

    public Diary(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void enterUserAndEmail(String user, String email){
        userField.clear();
        userField.sendKeys(user);
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void checkCheckBox(){
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
    }

    public void clickButton(){
        button.click();
    }

    public boolean avatarVisible(){
        return avatar.isDisplayed();
    }

}
