package org.prog.work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeWork {

    private WebDriver driver;
    @BeforeSuite
    public void setUp (){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void goAlloUA(){
        Assert.assertNotNull(driver,"Driver has not been initialized");
        driver.get("тут повинна бути силка на сайт");
    }



    @AfterSuite
    public void tearDown(){
        Assert.assertNotNull(driver,"Driver has not been initialized");
   driver.quit();
    }

    @Test
    public void testAlloUA(){

    }

}


