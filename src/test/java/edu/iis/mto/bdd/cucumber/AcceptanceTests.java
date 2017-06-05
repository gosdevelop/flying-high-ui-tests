package edu.iis.mto.bdd.cucumber;

import org.junit.BeforeClass;

public class AcceptanceTests {

    private static final String GECKODRIVER_NAME = "geckodriver.exe";
    private static final String GECKO_PATH = "D:\\geckodriver-v0.16.1-win64\\";

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.gecko.driver", GECKO_PATH + GECKODRIVER_NAME);

    }
}
