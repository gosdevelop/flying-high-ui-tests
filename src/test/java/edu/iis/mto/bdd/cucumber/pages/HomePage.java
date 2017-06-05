package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Konrad Gos on 05.06.2017.
 */
public class HomePage {
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getWelcomeMessage() {
        return webDriver.findElement(By.id("welcome-message")).getText();
    }
}
