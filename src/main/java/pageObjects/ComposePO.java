package pageObjects;

import PageUIs.ComposePUI;
import commons.BasePage;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ComposePO extends BasePage {
    private WebDriver driver;

    public ComposePO(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToComposeButton() {
        waitForElementClickable(driver, ComposePUI.COMPOSE_BUTTON);
        clickToElement(driver, ComposePUI.COMPOSE_BUTTON);
    }

    public void sendkeyToRecipientTextboxOnComposePopup(String sampleRecipientEmailAddress) {
        sampleRecipientEmailAddress = GlobalConstants.SAMPLE_RECIPIENT_EMAIL_ADDRESS;
        waitForElementVisible(driver, ComposePUI.RECIPIENT_TEXTBOX);
        senkeyToElement(driver, ComposePUI.RECIPIENT_TEXTBOX, sampleRecipientEmailAddress);
    }

    public void senkeyToSubjectTextboxOnPopup(String sampleEmailSubjectContent) {
        sampleEmailSubjectContent = GlobalConstants.SAMPLE_EMAIL_SUBJECT_CONTENT;
        waitForElementVisible(driver, ComposePUI.SUBJECT_TEXTBOX);
        senkeyToElement(driver, ComposePUI.SUBJECT_TEXTBOX, sampleEmailSubjectContent);
    }

    public void sendkeyToBodyTextboxOnPopup(String sampleEmailContent) {
        sampleEmailContent = GlobalConstants.SAMPLE_EMAIL_CONTENT;
        waitForElementVisible(driver, ComposePUI.MESSAGE_BODY_TEXTBOX);
        senkeyToElement(driver, ComposePUI.MESSAGE_BODY_TEXTBOX, sampleEmailContent);
    }

    public void clickToSendButton() {
        waitForElementClickable(driver, ComposePUI.SEND_EMAIL_BUTTON);
        clickToElement(driver, ComposePUI.SEND_EMAIL_BUTTON);
    }

    public void checkSentMessageToastAppearance() {
        waitForElementVisible(driver, ComposePUI.MESSAGE_SENT_TOAST);
    }

    public void checkUndoButtonDisappearance() {
        waitForListElementInvisible(driver, ComposePUI.UNDO_BUTTON_ON_TOAST);
    }

    public void clickToSentSidebarMenu() {
        waitForElementClickable(driver, ComposePUI.SENT_SIDEBAR_MENU);
        clickToElement(driver, ComposePUI.SENT_SIDEBAR_MENU);
    }

    public void checkRecordEmailWithSubjectAsAppearance(String sampleEmailSubjectContent) {
        waitForElementVisible(driver, ComposePUI.DYNAMIC_SENT_EMAIL_RECORD_WITH_SUBJECT, sampleEmailSubjectContent);
    }

    public void clickToSentEmailRecordWithSubjectAs(String sampleEmailSubjectContent) {
        waitForElementClickable(driver, ComposePUI.DYNAMIC_SENT_EMAIL_RECORD_WITH_SUBJECT, sampleEmailSubjectContent);
        clickToElement(driver, ComposePUI.DYNAMIC_SENT_EMAIL_RECORD_WITH_SUBJECT, sampleEmailSubjectContent);
    }

    public void checkAllEmailInfoMatched(String sampleRecipientEmailAddress, String sampleEmailSubjectContent, String sampleEmailContent) {
        Assert.assertEquals(getElementText(driver, ComposePUI.SENT_EMAIL_DETAIL_RECIPIENT), sampleRecipientEmailAddress );
        Assert.assertTrue(isElementDisplayed(driver, ComposePUI.DYNAMIC_SENT_EMAIL_DETAIL_WITH_SUBJECT, sampleEmailSubjectContent));
        Assert.assertTrue(isElementDisplayed(driver, ComposePUI.DYNAMIC_SENT_EMAIL_DETAIL_WITH_MESSAGE_BODY, sampleEmailContent));
    }
}
