package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public RandomSearchedPage loadRandomPage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.xpath("//div[@data-sokoban-container]/div/div/a")).get(0)));
        List<WebElement> results = driver.findElements(By.xpath("//div[@data-sokoban-container]/div/div/a"));
        Random generator = new Random();
        int generatedNumber = generator.nextInt(results.size() - 1);
        results.get(generatedNumber).click();
        return new RandomSearchedPage(driver);
    }
}