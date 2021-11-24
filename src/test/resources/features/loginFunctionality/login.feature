@Login
Feature: Login
  As a User
  I want to perform login on demoqa.com
  So that I can buy and read a book

  @LoginSuccess
  Scenario: Login Success
    Given I open demoqa login page
    When  I input valid username and password
    Then  I can see my profile

  @LoginFailed
  Scenario: Login Failed
    Given I open demoqa login page for the second time
    When  I input valid username and invalid password
    Then  I am failed to login because invalid password
