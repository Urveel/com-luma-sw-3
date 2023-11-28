package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class GearTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com";

    @Before
    public void browsersetup() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldAddProductSuccessFullyToShoppingCart() {
        mouseHoverToElement(By.xpath("//span[normalize-space()='Gear']"));
        clickOnElement(By.xpath("//span[normalize-space()='Bags']"));
        clickOnElement(By.xpath("//a[normalize-space()='Overnight Duffle']"));
        String expected = "Overnight Duffle";
        String actual = driver.findElement(By.xpath("//span[@class='base']")).getText();
        Assert.assertEquals(expected,actual);
        String expected1 = "3";
        String actual1 = driver.findElement(By.xpath("//input[@id='cart-236154-qty']")).getText();
        Assert.assertEquals(expected1,actual1);
        String expected2= "$135.00";
        String actual2= driver.findElement(By.xpath("//span[contains(text(),'$135.00')]")).getText();
        driver.findElement(By.xpath("//input[@id='cart-236154-qty']")).clear();
        driver.findElement(By.xpath("//input[@id='cart-236154-qty']")).sendKeys("5");
        driver.findElement(By.xpath("//span[normalize-space()='Update Shopping Cart']")).click();
        String expectedText5= "$225.00";
        String actualText5= driver.findElement(By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")).getText();
        Assert.assertEquals(expectedText5,actualText5);

    }
    @After
    public void closeBrowser(){driver.close();}
}
