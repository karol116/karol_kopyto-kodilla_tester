package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private GoogleResults googleResults;
    private RandomSearchedPage randomSearchedPage;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

    public RandomSearchedPage openRandomSearchedPage(WebDriver driver) {
        searchResults();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.xpath("//a/h3")).get(0)));
        List<WebElement> results = driver.findElements(By.xpath("//a/h3"));
        Random generator = new Random();
        results.get(generator.nextInt(results.size() - 1)).click();
        RandomSearchedPage randomSearchedPage = new RandomSearchedPage(driver);
        return randomSearchedPage;
    }
}