$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/formedix.feature");
formatter.feature({
  "name": "Login to the application with credentials and perform some actions and logout of the application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the sign in page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.LoginStepDefinitions.userIsOnTheSignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type valid username and password and click the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.LoginStepDefinitions.userTypeValidUsernameAndPasswordAndClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to Repository-\u003eStudies and perform the following actions and logout of the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User navigate to \"Repository\" \"Studies\" menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.DashboardPageStepDefinitions.userNavigateToMenu(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see following options",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_should_see_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the View",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_click_on_the_View()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the Data acquisition",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_click_on_the_Data_acquisition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the Forms",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_click_on_the_Forms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the medical history form",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.user_select_the_medical_history_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the Edit Form",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.user_click_on_the_Edit_Form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add a description and save the change",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.user_add_a_description_and_save_the_change()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify updates has been preserved on the property panel and on the main form view",
  "keyword": "Then "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.verify_updates_has_been_preserved_on_the_property_panel_and_on_the_main_form_view()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to \"testteamtechtest\" \"Sign out\" menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.DashboardPageStepDefinitions.userNavigateToMenu(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});