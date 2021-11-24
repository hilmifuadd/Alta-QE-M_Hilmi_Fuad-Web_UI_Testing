@ReadBook
Feature: Read Book Collection
  As a User
  I want to perform read collection book on demoqa.com
  So that I read description the book

  Scenario: Read Book Collection Success
    Given I open login bookstore
    When  I input valid username and password to read book
    And I go to profile status book
    Then  I click go to bookstore
    And I click the book i want to see