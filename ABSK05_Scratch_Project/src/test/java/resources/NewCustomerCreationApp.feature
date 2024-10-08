@sanity

Feature: To Create a new Customer with all details

  Background: 
    Given User opens the URL of the application
    And User will enter the username with "mngr587535"
    And User will enter the password with "Adyhaze"
    When User clicks on Login button
    Then User will be able to login to the application

  Scenario Outline: Creation of New Customer with all the credentials
    And User will click on the add new Customer link in the app
    And User will enter the customer name in app as "<Customer_Name>"
    And User will select the gender in app
    And User will enter the dOB in app as "<DOB>"
    And User will enter the address in app as "<Address>"

    Examples: 
      | Customer_Name | DOB        | Address  |
      | Harry         | 12-06-1997 | Kalighat |
