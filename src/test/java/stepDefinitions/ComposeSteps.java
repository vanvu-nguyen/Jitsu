package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import commons.PageGenerator;
import pageObjects.ComposePO;

public class ComposeSteps {

    WebDriver driver;
    ComposePO composePage;
    public ComposeSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        this.composePage = PageGenerator.getComposePage(driver);
    }

    @When("i click to Compose button")
    public void iClickToComposeButton() {
        composePage.clickToComposeButton();
    }

    @And("i enter the recipient email address as {string}")
    public void iEnterTheRecipientEmailAddressAs(String sampleRecipientEmailAddress) {
        composePage.sendkeyToRecipientTextboxOnComposePopup(sampleRecipientEmailAddress);
    }

    @And("i enter the email subject as {string}")
    public void iEnterTheEmailSubjectAs(String sampleEmailSubjectContent) {
        composePage.senkeyToSubjectTextboxOnPopup(sampleEmailSubjectContent);
    }

    @And("i enter the email content as {string}")
    public void iEnterTheEmailContentAs(String sampleEmailContent) {
        composePage.sendkeyToBodyTextboxOnPopup(sampleEmailContent);
    }

    @When("i click to send button")
    public void iClickToSendButton() {
        composePage.clickToSendButton();
    }

    @Then("send email toast appears")
    public void sendEmailToastAppears() {
        composePage.checkSentMessageToastAppearance();
    }

    @And("i wait for undo button on send email toast disappears")
    public void iWaitForUndoButtonOnSendEmailToastDisappears() {
        composePage.checkUndoButtonDisappearance();
    }

    @When("i click to Sent sidebar menu")
    public void iClickToSentSidebarMenu() {
        composePage.clickToSentSidebarMenu();
    }

    @And("i wait for record email with subject as {string} appears")
    public void iWaitForRecordEmailWithSubjectAsAppears(String sampleEmailSubjectContent) {
        composePage.checkRecordEmailWithSubjectAsAppearance(sampleEmailSubjectContent);
    }

    @And("i click to the record with subject as {string}")
    public void iClickToTheRecordWithSubjectAs(String sampleEmailSubjectContent) {
        composePage.clickToSentEmailRecordWithSubjectAs(sampleEmailSubjectContent);
    }

    @Then("all the primary info of created email are correct as {string} and {string} and {string}")
    public void allThePrimaryInfoOfCreatedEmailAreCorrectAsAndAnd(String sampleRecipientEmailAddress
            , String sampleEmailSubjectContent
            , String sampleEmailContent) {
        composePage.checkAllEmailInfoMatched(sampleRecipientEmailAddress, sampleEmailSubjectContent, sampleEmailContent);
    }

}
