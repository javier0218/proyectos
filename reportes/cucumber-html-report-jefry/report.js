$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/GestionAdm.feature");
formatter.feature({
  "line": 1,
  "name": "Probar el modulo Turnos",
  "description": "",
  "id": "probar-el-modulo-turnos",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10841669557,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Enter turn module",
  "description": "",
  "id": "probar-el-modulo-turnos;enter-turn-module",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser and start MHO",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Sign in Application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Should be able to login succesfully",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter Administrative Management",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter Module Turn",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The module turn open succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.open_browser_and_start_MHO()"
});
formatter.result({
  "duration": 9534576685,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_Sign_in_Application()"
});
formatter.result({
  "duration": 78205933063,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_Should_be_able_to_login_succesfully()"
});
formatter.result({
  "duration": 55680,
  "status": "passed"
});
formatter.match({
  "location": "TurnoSteps.i_enter_Administrative_Management()"
});
formatter.result({
  "duration": 1034829485,
  "status": "passed"
});
formatter.match({
  "location": "TurnoSteps.i_enter_Module_turn()"
});
formatter.result({
  "duration": 3269421145,
  "status": "passed"
});
formatter.match({
  "location": "TurnoSteps.the_module_turn_open_succesfully()"
});
formatter.result({
  "duration": 30133799,
  "status": "passed"
});
formatter.after({
  "duration": 2133012011,
  "status": "passed"
});
formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login MHO",
  "description": "",
  "id": "test-login-mho",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4755546567,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login MHO",
  "description": "",
  "id": "test-login-mho;login-mho",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open browser and start MHO",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter a valid \"jpizarro\" and valid \"aaa\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Should be able to login succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.open_browser_and_start_MHO()"
});
formatter.result({
  "duration": 1460475470,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginSteps.user_Should_be_able_to_login_succesfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1096415484,
  "status": "passed"
});
});