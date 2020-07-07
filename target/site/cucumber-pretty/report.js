$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user can search product",
  "description": "",
  "id": "login;verify-user-can-search-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter XPS in serach field",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on search link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_URL()"
});
formatter.result({
  "duration": 7404247200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_XPS_in_serach_field()"
});
formatter.result({
  "duration": 1003033100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_search_link()"
});
formatter.result({
  "duration": 764080500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify laptop page display",
  "description": "",
  "id": "login;verify-laptop-page-display",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click on cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_URL()"
});
formatter.result({
  "duration": 7500883600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_cart()"
});
formatter.result({
  "duration": 637308200,
  "status": "passed"
});
});