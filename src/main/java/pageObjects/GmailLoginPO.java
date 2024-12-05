package pageObjects;


import PageUIs.GmailLoginPUI;
import commons.BasePage;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;

public class GmailLoginPO extends BasePage {
    private WebDriver driver;

    public GmailLoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public void checkGmailLoginPageAppearance() {
        waitForElementVisible(driver, GmailLoginPUI.SIGN_IN_PAGE_HEADER);
    }

    public void sendkeyToEmailAddressTextbox(String sampleGmailAddress) {
        sampleGmailAddress = GlobalConstants.SAMPLE_GMAIL_ADDRESS;
        waitForElementVisible(driver, GmailLoginPUI.EMAIL_ADDRESS_TEXTBOX);
        senkeyToElement(driver, GmailLoginPUI.EMAIL_ADDRESS_TEXTBOX, sampleGmailAddress);
    }

    public void clickToNextButton() {
        waitForElementClickable(driver, GmailLoginPUI.NEXT_BUTTON);
        clickToElement(driver, GmailLoginPUI.NEXT_BUTTON);
    }

    public void sendkeyToPasswordTextbox(String sampleGmailPassword) {
        sampleGmailPassword = GlobalConstants.SAMPLE_GMAIL_PASSWORD;
        waitForElementVisible(driver, GmailLoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, GmailLoginPUI.PASSWORD_TEXTBOX, sampleGmailPassword);
    }

}
