package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModal;
import pages.MainPage;
import singletonSession.Session;

public class LoginTodoIst {
    MainPage mainPage= new MainPage();
    LoginModal loginModal = new LoginModal();

    // @BeforeEach junit5 -- junitjupiter
    @Before
    public void before(){
        Session.getSession().getDriver().get("https://todoist.com/");
    }
    // @AfterEach  junit5 -- junitjupiter
    @After
    public void after(){
        Session.getSession().closeSession();
    }

    @Test
    @DisplayName("Verify the login using correct user and pasword")
    @Description("This test case si to verify the login functionality when we are using an user and pwd ....")
    @Link("www.jira.com/TC999999")
    @Issue("BUG888888")
    public void verifyTheLogin(){
        mainPage.loginButton.click();
        loginModal.emailTxt.fillText("jhuamandonayre@gmail.com");
        loginModal.passwordTxt.fillText("12345");
        loginModal.loginButon.click();

        // verificacion
        // Assertion.assertFalse(loginModal.loginButon.isControlDisplayed(),"ERROR");
        Assert.assertFalse("ERROR no ingreso al sistema",loginModal.loginButon.isControlDisplayed());
    }
}
