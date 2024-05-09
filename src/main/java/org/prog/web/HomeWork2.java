package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeWork2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://allo.ua/");
            WebElement profileBtn = driver.findElement(By.className("search-form__input"));
            profileBtn.click();

        //     WebElement loginBtn = driver.findElement(By.className("auth__enter-password"));
        //      loginBtn.click();

        //    WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(3L));
        //    WebElement pwdBtnWait = driverWait.until(
        //            ExpectedConditions.presenceOfElementLocated(By.className("auth__enter-password")));
        //    pwdBtnWait.click();

            WebElement phone = driver.findElement(By.className("phoneEmail"));
            phone.click();
        } finally {
            driver.quit();
        }


    }
}


