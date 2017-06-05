package edu.iis.mto.bdd.cucumber.workflowsteps;

import edu.iis.mto.bdd.cucumber.pages.HomePage;
import edu.iis.mto.bdd.cucumber.pages.LoginPage;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Konrad Gos on 05.06.2017.
 */
public class AuthenticationWorkFlowSteps {

    private WebDriver webDriver;

    private HomePage homePage;
    private LoginPage loginPage;

    public AuthenticationWorkFlowSteps() {
    }

    public AuthenticationWorkFlowSteps(WebDriver webDriver) {
        this.webDriver=webDriver;
        this.homePage = new HomePage(webDriver);
        this.loginPage = new LoginPage(webDriver);
    }

    @Step
    public void signInWithCreditialsFor(FrequentFlyerMember user) {
        loginPage.getLoginSite("http://localhost:8080/#/welcome");
        loginPage.logIn(user);
    }

    @Step
    public void verifyWelcomeMessageFor(FrequentFlyerMember user) {
        assertThat(homePage.getWelcomeMessage(), equalTo("Witaj " + user.getFirstName()));
    }
}
