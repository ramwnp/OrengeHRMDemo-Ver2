$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/My_Info.feature");
formatter.feature({
  "name": "My_Info",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter into My_Info page and enter Personal Details and save",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Crome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Crome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters userName as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_userName_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on My_info module",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_My_info_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Employee info",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_Employee_info()"
});
formatter.result({
  "status": "passed"
});
});