import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.RandomSearchedPage;

import java.util.List;
import java.util.Random;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.loadResults(driver);
    }

    @Test
    public void testOpenRandomSearchedPage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleResults googleResults = googleSearch.loadResults(driver);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@data-sokoban-container]/div/div/a[@href]"));
        Random random = new Random();
        int randomElement = random.nextInt(elements.size() -1);
        String linkText = elements.get(randomElement).getAttribute("href");

        googleResults.loadSelectedPage(randomElement);
        Assert.assertEquals(driver.getCurrentUrl(),linkText);
    }
}