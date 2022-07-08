package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement confirmCookieFiles = driver.findElement(By.cssSelector("button[class*='k4 _158e2_rNMWZ ']"));
        confirmCookieFiles.click();

        WebElement categoryList = driver.findElement(By.cssSelector("form > div > div > select"));
        Select categorySelect = new Select(categoryList);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("header > div > div > div > div > form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article[data-analytics-view-custom-index0=\"0\"]")));

        List<WebElement> searchResults = driver.findElements(By.cssSelector("section > article"));
        System.out.println(searchResults.get(0).getText());
    }
}