$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase.feature");
formatter.feature({
  "line": 2,
  "name": "softpedia Website",
  "description": "",
  "id": "softpedia-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Checks login page of Softpedia",
  "description": "",
  "id": "softpedia-website;checks-login-page-of-softpedia",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login Softpedia page opened",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in the login field",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Takes a screenshot",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "softpedia-website;checks-login-page-of-softpedia;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 14,
      "id": "softpedia-website;checks-login-page-of-softpedia;;1"
    },
    {
      "cells": [
        "sachin.addagudi@gmail.com",
        "",
        "sachin10"
      ],
      "line": 15,
      "id": "softpedia-website;checks-login-page-of-softpedia;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Checks login page of Softpedia",
  "description": "",
  "id": "softpedia-website;checks-login-page-of-softpedia;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_01"
    },
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login Softpedia page opened",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter \"sachin.addagudi@gmail.com\" and \"sachin10\" in the login field",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Takes a screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdef.i_launch_chrome_browser()"
});
formatter.result({
  "duration": 17348827800,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.login_softpedia_page_opened()"
});
formatter.result({
  "duration": 380537700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sachin.addagudi@gmail.com",
      "offset": 7
    },
    {
      "val": "sachin10",
      "offset": 39
    }
  ],
  "location": "loginstepdef.enter_something_and_something_in_the_login_field(String,String)"
});
formatter.result({
  "duration": 1131691200,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.click_on_the_login_button()"
});
formatter.result({
  "duration": 107602400,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdef.takes_a_screenshot()"
});
formatter.result({
  "duration": 2439708700,
  "status": "passed"
});
});