@Gmail
Feature: Write a letter

  Scenario: Login to Gmail
    Given i have already accessed to gmail login page
    When i enter to email address textbox as "sampleGmailAddress"
    And i click to next button
    And i enter to password textbox as "sampleGmailPassword"
    And i click to next button

  Scenario: Compose an email
    When i click to Compose button
    And i enter the recipient email address as "sampleRecipientEmailAddress"
    And i enter the email subject as "sampleEmailSubjectContent"
    And i enter the email content as "sampleEmailContent"

  Scenario: Send email and check
    When i click to send button
    Then send email toast appears
    And i wait for undo button on send email toast disappears
    When i click to Sent sidebar menu
    And i wait for record email with subject as "sampleEmailSubjectContent" appears
    And i click to the record with subject as "sampleEmailSubjectContent"
    Then all the primary info of created email are correct as "sampleRecipientEmailAddress" and "sampleEmailSubjectContent" and "sampleEmailContent"





