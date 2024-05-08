package org.prog.work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class HomeWork {

    private WebDriver driver;
    @BeforeSuite
    public void setUp (){
        this.driver = new ChromeDriver();
    }
    @AfterSuite
    public void tearDown(){
        Assert.assertNotNull(driver,"Driver has not been initialized");
   driver.quit();
    }
}

