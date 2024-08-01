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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#fdxMdbContainerListItem0MenuToggle\"}\n  (Session info: chrome\u003d127.0.6533.73)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-11NHPOV\u0027, ip: \u0027100.83.79.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.19\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 127.0.6533.73, chrome: {chromedriverVersion: 127.0.6533.88 (a2d0cb026721..., userDataDir: C:\\Users\\samsung\\AppData\\Lo...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:59410}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: fad7a13b0a60b8dd38eeff66bb66a1b5\n*** Element info: {Using\u003did, value\u003dfdxMdbContainerListItem0MenuToggle}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.formedix.pages.StudiesPage.getTechStudyOptions(StudiesPage.java:42)\r\n\tat com.formedix.stepDefinitions.StudiesStepDefinitions.user_should_see_following_options(StudiesStepDefinitions.java:15)\r\n\tat ✽.User should see following options(file:///C:/Users/samsung/Desktop/FormedixTest/src/test/resources/features/formedix.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on the View",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_click_on_the_View()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on the Data acquisition",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_click_on_the_Data_acquisition()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on the Forms",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.StudiesStepDefinitions.user_click_on_the_Forms()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select the medical history form",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.user_select_the_medical_history_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on the Edit Form",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.user_click_on_the_Edit_Form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User add a description and save the change",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.user_add_a_description_and_save_the_change()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify updates has been preserved on the property panel and on the main form view",
  "keyword": "Then "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.FormStepDefinitions.verify_updates_has_been_preserved_on_the_property_panel_and_on_the_main_form_view()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User navigate to \"testteamtechtest\" \"Sign out\" menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.formedix.stepDefinitions.DashboardPageStepDefinitions.userNavigateToMenu(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});