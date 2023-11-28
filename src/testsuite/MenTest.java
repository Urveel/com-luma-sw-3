package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MenTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com";
    @Before
    public void browsersetup (){
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart(){
        mouseHoverToElement(By.xpath("//a[@id='ui-id-5']"));
        mouseHoverToElement(By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]"));
        clickOnElement(By.xpath("//a[@id='ui-id-23']"));
        mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
        clickOnElement(By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']"));
        mouseHoverToElement(By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]"));
        mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
        clickOnElement(By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']"));
        mouseHoverToElement(By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]"));
        mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
        clickOnElement(By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]"));
        clickOnElement(By.xpath("//div[@id='option-label-size-143-item-175']"));
        clickOnElement(By.xpath("//div[@id='option-label-color-93-item-49']"));
        String expectedText = "Shopping cart";
        String actualText = driver.findElement(By.xpath("//body/div[1]/main[1]/div[1]/h1[1]/span[1]")).getText();
        Assert.assertEquals(expectedText,actualText);
        String expectedText2="Cronus Yoga Pant";
        String actualText2= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]")).getText();
        Assert.assertEquals(expectedText2,actualText2);
        String expectedText3="32";
        String actualText3= driver.findElement(By.xpath("//dd[contains(text(),'32')]")).getText();
        Assert.assertEquals(expectedText3,actualText3);
        String expectedText4="Black";
        String actualText4= driver.findElement(By.xpath("//dd[contains(text(),'Black')]")).getText();
        Assert.assertEquals(expectedText,actualText);





    }

}
