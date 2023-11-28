package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.time.Duration;
import java.util.List;

public class WomenTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test


    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        mouseHoverToElement(By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']"));
        mouseHoverToElement(By.xpath("//a[@id='ui-id-9']"));
        clickOnElement(By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement dropDown = driver.findElement(By.id("sorter"));
        Select select = new Select(dropDown);
        select.selectByValue("name");

        //To print the name of 12 images in console
        List<WebElement> element1 = driver.findElements(By.xpath("//strong[@class = 'product name product-item-name']"));
        for (WebElement result : element1) {
            System.out.println(result.getText());
            Thread.sleep(2);

        }
    }


    @After
    public void closeBrowser() {

        driver.close();
    }
}
