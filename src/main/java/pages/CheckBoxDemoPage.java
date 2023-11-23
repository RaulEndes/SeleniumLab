package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxDemoPage  extends BasePage{



    public CheckBoxDemoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    public void clickOnSingleCheckBox(){singleCheckBox.click();
    }

    @FindBy(id= "txtAge")
    private WebElement CheckedText;


    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)")
    private WebElement Option1 ;

    public void ClickOnOption1CheckBox(){Option1.click();
    }

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input")
    private WebElement Option2;

    public void ClickOnOption2CheckBox(){Option2.click();
    }

    @FindBy(css = "#ex1-check1")
    private WebElement FirstOption;

    public void ClickOnFirstOption(){FirstOption.click();
    }

    @FindBy(css ="#ex1-check2")
    private WebElement SecondOption;

    public void ClickOnSecondOption(){SecondOption.click();
    }

    @FindBy(css ="#ex1-check3")
    private WebElement ThirdOption;

    public void ClickOnThirdOption(){ThirdOption.click();
    }
    @FindBy(css ="#ex1-check3")
    private WebElement FourthOption;

    public void ClickOnFourthOption(){FourthOption.click();
    }

    @FindBy(css ="#box")
    private WebElement CheckAllButton;

    public void ClickOnCheckAllButton(){CheckAllButton.click();}




}
