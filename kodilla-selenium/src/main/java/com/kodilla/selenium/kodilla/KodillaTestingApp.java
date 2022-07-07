//package com.kodilla.selenium.kodilla;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class KodillaTestingApp {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
//        WebDriver webDriver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(webDriver, 15);
//        webDriver.get("https://kodilla.com/pl/sign-in");
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/form/div/span/span/p/span"))).click();
//
//        WebElement inputField = webDriver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
//        inputField.sendKeys("testuser@gmail.com");
//
//        inputField = webDriver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
//        inputField.sendKeys("Haslo");
//
//        WebElement loginButton = webDriver.findElement(By.xpath("//html/body/div/div/form/div/button"));
//        loginButton.click();
//    }
//}
