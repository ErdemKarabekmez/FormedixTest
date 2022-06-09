Feature: Login to the application with credentials and perform some actions and logout of the application


  Background:
    Given User is on the sign in page
    When User type valid username and password and click the sign in button


  @wip
  Scenario: Navigate to Repository->Studies and perform the following actions and logout of the application
    When User navigate to "Repository" "Studies" menu
    Then User should see following options
      | View                  |
      | Edit                  |
      | Remove this study     |
      | Transition this study |
    And User click on the View
    And User click on the Data acquisition
    And User click on the Forms
    And User select the medical history form
    And User click on the Edit Form
    And User add a description and save the change
    Then verify updates has been preserved on the property panel and on the main form view
    And User navigate to "testteamtechtest" "Sign out" menu