Feature: Login to the application with credentials and perform some actions and logout of the application

 # Background:
  @wip
  Scenario:
    Given User is on the sign in page
    When User type valid username and password and click the sign in button
    Then Verify the dashboard page


#  Scenario: Navigate to Repository->Studies and perform the following actions and logout of the application
#    Given User navigate to "Repository" "Studies" menu
#    When User should see following options
#      | View                  |
#      | Edit                  |
#      | Remove this study     |
#      | Transition this study |
#    And User click on the View
#    And User click on the Data acquisition
#    And User click on the Forms
#    And User select the medical history form
#    And User click on the Edit Form
#    And User add a description and save the change
#    Then verify updates has been preserved on the property panel and on the main form view
#    And User is hover over on the user icon and click on the sign out
