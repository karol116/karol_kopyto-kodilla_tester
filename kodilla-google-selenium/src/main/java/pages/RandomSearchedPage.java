package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomSearchedPage extends AbstractPage {

    public RandomSearchedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getLink() {
        return driver.getCurrentUrl();
    }
}