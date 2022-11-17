package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CarSearch extends AbstractPage {
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    private CarResult carResults;

    public CarSearch(WebDriver driver) {

        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, CarSearch.class);
        inputField.sendKeys("Car");
        carResults = loadResults(driver);
        carResults.iSeeResults();
    }

    public CarResult loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        CarResult carResults = new CarResult(driver);
        return carResults;
    }
}