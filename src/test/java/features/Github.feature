@Github
Feature: Get repository information from Github

  Scenario: Get total open issue
    Given i send request to get all repositories belongs to SeleniumHQ
    When i loop through all repositories to get all open issue number
    Then i add all it up then return the total open issue count

  Scenario: Sort the repositories
    When i sort the date updated in descending order
    Then i create a new repository list with sorted date update order then return the list

  Scenario: Get the most watchers repository
    When i find the greatest watcher number
    Then i retrieve repository owns greatest watcher number then return the repository




