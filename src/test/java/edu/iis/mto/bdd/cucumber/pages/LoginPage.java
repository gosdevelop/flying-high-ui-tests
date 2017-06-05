package edu.iis.mto.bdd.cucumber.pages;

import edu.iis.mto.bdd.model.FrequentFlyerMember;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Konrad Gos on 05.06.2017.
 */
public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void getLoginSite(String url) {
        webDriver.get(url);
    }

    public void logIn(FrequentFlyerMember user) {
        webDriver.findElement(By.name("email")).sendKeys(user.getEmail());
        webDriver.findElement(By.name("password")).sendKeys(user.getPassword());
        webDriver.findElement(By.name("signin")).click();
    }
}
