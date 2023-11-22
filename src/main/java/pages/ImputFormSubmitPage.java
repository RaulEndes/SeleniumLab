package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ImputFormSubmitPage extends BasePage {

    public ImputFormSubmitPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#name")
    private WebElement EnterName;

    public void EnterNameInNameField() {
        EnterName.sendKeys("Name");
    }

    @FindBy(css = "#inputEmail4")
    private WebElement EnterMail;

    public void EnterMailInMailField() {
        EnterMail.sendKeys("email@random.com");
    }

    @FindBy (css = "#inputPassword4")
    private WebElement EnterPassword;
    public void EnterPasswordInPasswordField(){EnterPassword.sendKeys("password");
    }

    @FindBy (css = "#company")
    private WebElement EnterCompanyName;

    public void EnterCompanyNameInField(){EnterCompanyName.sendKeys(("Company"));
    }

    @FindBy(id = "websitename")
    private WebElement EmterWebsite;

    public void EnterWebsiteInTheField(){EmterWebsite.sendKeys(("www.website.com"));
    }

    @FindBy(id = "inputCity")
    private WebElement EnterCityName;

    public void EnterCityNameInField(){EnterCityName.sendKeys("Cluj");
    }

    @FindBy(id = "inputAddress1")
    private WebElement EnterAdress;

    public void EnterAdressInTheField (){EnterAdress.sendKeys("Strada Numar Localitate");
    }

    @FindBy(id = "inputAddress2")
    private WebElement EnterAdress2;

    public void EnterAdress2InTheField (){EnterAdress2.sendKeys("Strada2 Numar2 Localitate2");
    }

    @FindBy (css = "#inputCity")
    private WebElement EnterStateName;

    public void EnterStateNameInTheField(){EnterStateName.sendKeys("Romania");
    }

    @FindBy (css = "#inputZip")

    private WebElement EnterZipCode;

    public void EnterZipCodeInTheField(){EnterZipCode.sendKeys("1234567890");
    }

    @FindBy(css = "#seleniumform > div.text-right.mt-20 > button")

    private WebElement SubmitButton;

    public void Submit(){
        SubmitButton.click();
    }



//Choose Option ---- de intrebat







}
