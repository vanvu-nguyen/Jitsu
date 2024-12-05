package stepDefinitions;

import commons.PageGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GithubPO;

public class GithubSteps {

    GithubPO githubPage;

    public GithubSteps() {
        this.githubPage = PageGenerator.getGithubPage();
    }

    @Given("i send request to get all repositories belongs to SeleniumHQ")
    public void iSendRequestToGetAllRepositoriesBelongsToSeleniumHQ() {
        githubPage.iSendRequestToGetAllRepositoriesBelongsToSeleniumHQ().prettyPrint();
    }


    @When("i loop through all repositories to get all open issue number")
    public void iLoopThroughAllRepositoriesToGetAllOpenIssueNumber() {
        System.out.println(githubPage.iLoopThroughAllRepositoriesToGetAllOpenIssueNumber());
    }

    @Then("i add all it up then return the total open issue count")
    public void iAddAllItUpThenReturnTheTotalOpenIssueCount() {
        System.out.println(githubPage.iAddAllItUpThenReturnTheTotalOpenIssueCount());
    }

    @When("i sort the date updated in descending order")
    public void iSortTheDateUpdatedInDescendingOrder() {
        System.out.println(githubPage.iSortTheDateUpdatedInDescendingOrder());
    }

    @Then("i create a new repository list with sorted date update order then return the list")
    public void iCreateANewRepositoryListWithSortedDateUpdateOrderThenReturnTheList() {
        System.out.println(githubPage.iCreateANewRepositoryListWithSortedDateUpdateOrderThenReturnTheList());
    }

    @When("i find the greatest watcher number")
    public void iFindTheGreatestWatcherNumber() {
        System.out.println(githubPage.iFindTheGreatestWatcherNumber());
    }

    @Then("i retrieve repository owns greatest watcher number then return the repository")
    public void iRetrieveRepositoryOwnsGreatestWatcherNumberThenReturnTheRepository() {
        System.out.println(githubPage.iRetrieveRepositoryOwnsGreatestWatcherNumberThenReturnTheRepository());
    }

}
