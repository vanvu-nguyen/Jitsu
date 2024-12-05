package stepDefinitions;

import commons.PageGenerator;
import cucumberOptions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.GmailLoginPO;

public class GmailLoginSteps {

    WebDriver driver;
    GmailLoginPO gmailLoginPage;
    public GmailLoginSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        this.gmailLoginPage = PageGenerator.getGmailLoginPage(driver);
    }

    @Given("i have already accessed to gmail login page")
    public void iHaveAlreadyAccessedToGmailLoginPage() {
        gmailLoginPage.checkGmailLoginPageAppearance();
    }

    @When("i enter to email address textbox as {string}")
    public void iEnterToEmailAddressTextboxAs(String sampleGmailAddress) {
        gmailLoginPage.sendkeyToEmailAddressTextbox(sampleGmailAddress);
    }

    @And("i click to next button")
    public void iClickToNextButton() {
        gmailLoginPage.clickToNextButton();
    }

    @And("i enter to password textbox as {string}")
    public void iEnterToPasswordTextboxAs(String sampleGmailPassword) {
        gmailLoginPage.sendkeyToPasswordTextbox(sampleGmailPassword);
    }

}
