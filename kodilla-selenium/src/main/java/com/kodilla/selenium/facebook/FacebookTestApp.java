package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div/div/div/div/div/button"))).click();

        WebElement createAccount = driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div/div/div/form/div[5]/a"));
        createAccount.click();

//        WebElement yearCombo = driver.findElement(
//                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
//
//        Select yearSelect = new Select(yearCombo);
//        yearSelect = new Select(yearCombo);
//        yearSelect.selectByIndex(5);
    }
}
