package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomeWork {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().window().maximize();

            driver.get("https://allo.ua/");

            WebElement profileBtn = driver.findElement(By.className("mh-profile"));
            profileBtn.click();
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(3L));
            WebElement pwdBtnWait = driverWait.until(
                    ExpectedConditions.presenceOfElementLocated(By.className("auth__enter-password")));
            pwdBtnWait.click();
            WebElement loginBtn = driverWait.until(
                    ExpectedConditions.presenceOfElementLocated(By.className("a-button--primary")));
            loginBtn.click();
            System.out.println("done!");
        } finally {
            driver.quit();
        }
    }
}
