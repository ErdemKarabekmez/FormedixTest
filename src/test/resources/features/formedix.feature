Feature: Login to the application with credentials and perform some actions and logout of the application


  Scenario: Login to the application with credentials
    Given User is on the sign in page and enters valid username and password
    When User click on the sign in button
    Then User is on the dashboard page
  @wip
  Scenario: Navigate to Repository->Studies and perform the following actions
    Given User navigate to Repository-Studies menu
    When User should see following options
      | View                  |
      | Edit                  |
      | Remove this study     |
      | Transition this study |
    And User click on the View
    And User click on the Data acquisition
    And User click on the Forms