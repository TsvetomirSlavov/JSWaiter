package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ONUR on 21.01.2017.
 */
public class Pages extends BasePage {

    public Pages(WebDriver driver) {
        super(driver);
    }

    public HomePage homePage () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;
    }

}
