@AddBook
Feature: Add Book Collection
  As a User
  I want to perform add collection book on demoqa.com
  So that I can buy and read the book later

  Scenario: Add Book Collection Success
    Given I open login page
    When  I input valid username and password to add book
      And I go to profile
      And I go to bookstore and choose the book
    Then  I click to my collection
      And The book successfully added
