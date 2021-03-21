@Registration
Feature: Validate that the user is able to autneticate the URL and then register a user

  @Launch
  Scenario: Launch the URL and authenticate it
    Given user launch the url and authenticate it
    When on the home page
    Then validate waracle logo
    And I close the browser

  @register
  Scenario Outline: Register user and validate the tilte
  Given user launch the url and authenticate it
    When user click on register link
    And provide details for <username> <emailAddress> and <password>
    And click on register
    Then the user should be register 
  	And I close the browser

    Examples: 
      | username | password | emailAddress     |
      | qazxe    |    12345 | qazxe@example.com |