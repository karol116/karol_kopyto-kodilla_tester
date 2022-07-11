package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(xpath = "//html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    static WebElement searchButton;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public GoogleResults loadResults(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");

        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img")).click();
        searchButton.click();

        return new GoogleResults(driver);
    }
}