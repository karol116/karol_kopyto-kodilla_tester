import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearch;

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
        String linkText = googleSearch
                .loadResults(driver)
                .loadRandomPage(driver)
                .getLink();
        Assert.assertEquals(linkText, driver.getCurrentUrl());
    }
}