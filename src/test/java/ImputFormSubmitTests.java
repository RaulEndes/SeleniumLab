import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ImputFormSubmitPage;
import pages.SimpleFormPage;

import javax.xml.transform.Result;

import static pages.BasePage.driver;

public class ImputFormSubmitTests extends BasePage {
    private ImputFormSubmitPage imputFormSubmitPage;

    private final By ImputFormLink = By.linkText("Input Form Submit");


    @BeforeMethod
    public void setUp() {
        super.setUp();
        imputFormSubmitPage = new ImputFormSubmitPage(driver);
    }

    @Test
    public void EnterName() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterNameInNameField();
    }

    @Test
    public void EnterEmail() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterMailInMailField();
    }

    @Test
    public void EnterPassword() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterPasswordInPasswordField();
    }

    @Test
    public void EnterCompany() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterCompanyNameInField();
    }

    @Test
    public void EnterWebsite() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterWebsiteInTheField();
    }

    @Test
    public void EnterCity() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterCityNameInField();
    }

    @Test
    public void EnterAdress1() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterAdressInTheField();
    }

    @Test
    public void EnterAdress2() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterAdress2InTheField();
    }

    @Test
    public void EnterState() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterStateNameInTheField();

    }

    @Test
    public void EnterZipCode() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.EnterZipCodeInTheField();
    }


    @Test
    public void SelectOptions() {

        driver.findElement(ImputFormLink).click();
        WebElement ddown = driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[3]/div[1]/select"));
        Select select = new Select(ddown);
        select.selectByValue("RO");

        String actualResult = driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[3]/div[1]/select/option[184]")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Romania"));


    }

    @Test
    public void SubmitButtonClick() {

        driver.findElement(ImputFormLink).click();
        imputFormSubmitPage.Submit();
    }
}
