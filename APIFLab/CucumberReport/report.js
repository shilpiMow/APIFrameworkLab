$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/API/features/Rest_API.feature");
formatter.feature({
  "line": 1,
  "name": "RestAPI Automation",
  "description": "",
  "id": "restapi-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing \"Get\", \"Post\", \"Patch\", \"Delete\" for Rest API",
  "description": "",
  "id": "restapi-automation;testing-\"get\",-\"post\",-\"patch\",-\"delete\"-for-rest-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I want to create a new user through \"Post\" call from Excel file \"Sheet1\" for the BaseUri \"https://osasapi.herokuapp.com\" and endpoint \"/customers\"",
  "rows": [
    {
      "cells": [
        "A1",
        "A4"
      ],
      "line": 5
    },
    {
      "cells": [
        "B1",
        "B4"
      ],
      "line": 6
    },
    {
      "cells": [
        "C1",
        "C4"
      ],
      "line": 7
    },
    {
      "cells": [
        "D1",
        "D4"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I verify that the user is created through HTTP Status code",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I want to retrieve the users Info through \"Get\" call from the BaseUri \"https://osasapi.herokuapp.com\" and endpoint \"/customers/5fbdd176e6f039001764e69d\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Also verify that I got the users info through HTTP Status code",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I want to update the users Info through \"Patch\"  call from Excel file \"Sheet1\" for the BaseUri \"https://osasapi.herokuapp.com\"  and endpoint \"/customers/5fbdccd5e6f039001764e698\"",
  "rows": [
    {
      "cells": [
        "C1",
        "C5"
      ],
      "line": 13
    },
    {
      "cells": [
        "D1",
        "D5"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "verifying I should get an valid HTTP code for updating",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I want to delete an user through \"Delete\" call from the BaseUri \"https://osasapi.herokuapp.com\" and endpoint \"/customers/5fbdccd5e6f039001764e698\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify that I deleted the users info through HTTP Status code",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Post",
      "offset": 37
    },
    {
      "val": "Sheet1",
      "offset": 65
    },
    {
      "val": "https://osasapi.herokuapp.com",
      "offset": 90
    },
    {
      "val": "/customers",
      "offset": 135
    }
  ],
  "location": "Rest_Steps.i_want_to_create_a_new_user_through_call_from_Excel_file_for_the_BaseUri_and_endpoint(String,String,String,String,String,String\u003e)"
});
formatter.result({
  "duration": 11051467799,
  "status": "passed"
});
formatter.match({
  "location": "Rest_Steps.i_verify_that_the_user_is_created_through_HTTP_Status_code()"
});
formatter.result({
  "duration": 885900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Get",
      "offset": 43
    },
    {
      "val": "https://osasapi.herokuapp.com",
      "offset": 71
    },
    {
      "val": "/customers/5fbdd176e6f039001764e69d",
      "offset": 116
    }
  ],
  "location": "Rest_Steps.i_want_to_retrieve_the_users_Info_through_call_from_the_BaseUri_and_endpoint(String,String,String)"
});
formatter.result({
  "duration": 553832999,
  "status": "passed"
});
formatter.match({
  "location": "Rest_Steps.also_verify_that_I_got_the_users_info_through_HTTP_Status_code()"
});
formatter.result({
  "duration": 506800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patch",
      "offset": 41
    },
    {
      "val": "Sheet1",
      "offset": 71
    },
    {
      "val": "https://osasapi.herokuapp.com",
      "offset": 96
    },
    {
      "val": "/customers/5fbdccd5e6f039001764e698",
      "offset": 142
    }
  ],
  "location": "Rest_Steps.i_want_to_update_the_users_Info_through_call_from_Excel_file_for_the_BaseUri_and_endpoint(String,String,String,String,String,String\u003e)"
});
formatter.result({
  "duration": 778691800,
  "status": "passed"
});
formatter.match({
  "location": "Rest_Steps.verifying_I_should_get_an_valid_HTTP_code_for_updating()"
});
formatter.result({
  "duration": 204101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delete",
      "offset": 34
    },
    {
      "val": "https://osasapi.herokuapp.com",
      "offset": 65
    },
    {
      "val": "/customers/5fbdccd5e6f039001764e698",
      "offset": 110
    }
  ],
  "location": "Rest_Steps.i_want_to_delete_an_user_through_call_from_the_BaseUri_and_endpoint(String,String,String)"
});
formatter.result({
  "duration": 320343800,
  "status": "passed"
});
formatter.match({
  "location": "Rest_Steps.verify_that_I_deleted_the_users_info_through_HTTP_Status_code()"
});
formatter.result({
  "duration": 200199,
  "status": "passed"
});
});