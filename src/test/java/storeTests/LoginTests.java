package storeTests;

import org.junit.Test;

public class LoginTests extends BaseTests {
    @Test
    public void shouldSuccessfullyLogin() {

        homePage.clickSingInButton();
        authenticationPage.enterEmailAddress("joheroj510@britted.com");
        authenticationPage.enterPassword("12345");
        authenticationPage.clickSingInButton();
        accountPage.verifyWelcomeMessage("Welcome to your account. Here you can manage all of your personal information and orders.");
        accountPage.logoutAccount();
    }
}
