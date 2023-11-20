package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {

    //=====================================================
    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    //=====================================================

    @FindBy(css = "input[placeholder = 'Please enter your Message']")
    private WebElement textField;

    public void enterTextinTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;


    public void clickOnGetCheckedValueButton() {
        getCheckedValueButton.click();
    }
///////////////////////////////////////////////////////////////////


    @FindBy(id = "sum1")
    private WebElement FirstValue;

    public void EnterFirstValue(String text) {
        FirstValue.sendKeys(text);

    }

    @FindBy(id = "sum2")

    private WebElement SecondValue;

    public void EnterSecondValue(String text) {
        SecondValue.sendKeys(text);
    }

    @FindBy(css = "#gettotal > button" )

    private WebElement Result;

    public void Result() {
        Result.click();

    }


////tema: de facut inca un test pentru alte scenarii
}

