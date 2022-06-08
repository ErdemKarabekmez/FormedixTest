Feature: Login to the application with credentials and perform some actions and logout of the application


  Scenario: Login to the application with credentials
    Given User is on the sign in page and enters valid username and password
    When User click on the sign in button
    Then User is on the dashboard page

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

    Scenario: Select Medical History Form and perform the following actions
      Given User select the medical history form
      When User click on the Edit Form
      And User add a description and save the change
      Then verify updates has been preserved on the property panel and on the main form view
  @wip
    Scenario: User logout of the application
      Given User is hover over on the user icon and click on the sign out
      Then User is on the sign in page