$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CathyaPacific.feature");
formatter.feature({
  "name": "user has to search a fight for travling",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to search the fight for specified date",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to in verified website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_has_to_in_verified_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give the from place of take",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_give_the_from_place_of_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give the to place for their destination",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_give_the_to_place_for_their_destination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to give date of travel",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_give_date_of_travel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to give date of return",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_give_date_of_return()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click search button for check available fight lists",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_search_button_for_check_available_fight_lists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see the fight list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_see_the_fight_list()"
});
formatter.result({
  "status": "passed"
});
});