import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;

import javax.xml.transform.Result;

import static pages.BasePage.driver;


public class SimpleFormTests extends BasePage{

    private SimpleFormPage simpleFormPage;

    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }


    @Test

    public void enterMessageAndClickGetCheckedValue() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextinTextField("Test");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Test"));
    }

    @Test

    public void enterMessageAndClickGetCheckedNumber() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextinTextField("1234");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1234"));
    }
    @Test

    public void enterMessageAndClickGetCheckedSymbol() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextinTextField("!@#$");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("!@#$"));
    }
    @Test

    public void enterMessageAndClickGetCheckedEmpty() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextinTextField("");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(""));
    }

    @Test

    public void enterNumberAndClickGetCheckedValue() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterFirstValue("1");
        simpleFormPage.EnterSecondValue("2");
        simpleFormPage.Result();



        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3"));
    }
    @Test

    public void enterNumberAndClickGetCheckedValue2() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterFirstValue("");
        simpleFormPage.EnterSecondValue("2");
        simpleFormPage.Result();



        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(""));
    }

    @Test

    public void enterNumberAndClickGetCheckedValue3() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterFirstValue("@");
        simpleFormPage.EnterSecondValue("2");
        simpleFormPage.Result();



        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(""));
    }
    @Test

    public void enterNumberAndClickGetCheckedValue4() {

        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterFirstValue("@");
        simpleFormPage.EnterSecondValue("@");
        simpleFormPage.Result();



        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(""));
    }




}
