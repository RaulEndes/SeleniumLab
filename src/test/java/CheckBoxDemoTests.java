import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckBoxDemoPage;
import pages.ImputFormSubmitPage;
import pages.SimpleFormPage;

import javax.xml.transform.Result;

import static pages.BasePage.driver;


public class CheckBoxDemoTests extends BasePage {

    private CheckBoxDemoPage checkBoxDemoPage;

    private final By checkBoxDemopage = By.linkText("Checkbox Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkBoxDemoPage = new CheckBoxDemoPage(driver);

    }

    @Test
    public void ClickOnCheckBox() {

        driver.findElement(checkBoxDemopage).click();
        checkBoxDemoPage.clickOnSingleCheckBox();
        String actualResult = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
        checkBoxDemoPage.ClickOnOption1CheckBox();
    }


     @Test
        public void ClickOnDisabledOptiond() {
        driver.findElement(checkBoxDemopage).click();
        checkBoxDemoPage.ClickOnOption1CheckBox();
        checkBoxDemoPage.ClickOnOption2CheckBox();

     }

     @Test
        public void ClickOnMultipleCheckBox(){
        driver.findElement(checkBoxDemopage).click();
        checkBoxDemoPage.ClickOnFirstOption();
        checkBoxDemoPage.ClickOnSecondOption();
        checkBoxDemoPage.ClickOnThirdOption();
        checkBoxDemoPage.ClickOnFourthOption();

     }

     @Test
    public void ClickOnCheckAllButton(){
        driver.findElement(checkBoxDemopage).click();
        checkBoxDemoPage.ClickOnCheckAllButton();

        String actualResult = driver.findElement(By.xpath("//*[@id=\"box\"]")).getAccessibleName(); //getAccesibleName este din DOM
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,"Uncheck All");  //Uncheck all este din DOM

     }
}