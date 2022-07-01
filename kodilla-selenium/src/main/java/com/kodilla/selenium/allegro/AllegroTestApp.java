package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement confirmCookieFiles = driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[2]/div[2]/button[1]"));
        confirmCookieFiles.click();

        WebElement categoryList = driver.findElement(By.xpath("//*[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select"));
        Select categorySelect = new Select(categoryList);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"mp4t_8 mp4t_0_l mryx_8 mryx_0_s m7er_k4 _13850_O2svT\"]/div/div/form/input"));
        inputField.sendKeys("Mavic mini");
    }
}
