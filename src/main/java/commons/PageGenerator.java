package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.ComposePO;
import pageObjects.GithubPO;
import pageObjects.GmailLoginPO;

public class PageGenerator {
    public static GmailLoginPO getGmailLoginPage(WebDriver driver) {return new GmailLoginPO(driver);}
    public static ComposePO getComposePage(WebDriver driver) {return new ComposePO(driver);}
    public static GithubPO getGithubPage() {return new GithubPO();}

}
