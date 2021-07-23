package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='info-account']")
    private WebElement welcomeMessage;
    @FindBy(xpath = "//*[@class='logout']")
    private WebElement logout;

    public void verifyWelcomeMessage(String expectedMessage){
        Assert.assertTrue(expectedMessage.equals(welcomeMessage.getText()));
    }

    public void logoutAccount(){
        logout.click();
    }
}
