package com.telran.remindly.tests;

import com.telran.remindly.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestsBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        app.init();

    }

    @AfterMethod(enabled = false)
    public void tiarDown() {
        app.stop();
    }

}

