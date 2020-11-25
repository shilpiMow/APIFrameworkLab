Feature: RestAPI Automation

  Scenario: Testing "Get", "Post", "Patch", "Delete" for Rest API 
    Given I want to create a new user through "Post" call from Excel file "Sheet1" for the BaseUri "https://osasapi.herokuapp.com" and endpoint "/customers" 
      |A1|A4| 
      |B1|B4|
      |C1|C4|
      |D1|D4|
    Then I verify that the user is created through HTTP Status code 
    Then I want to retrieve the users Info through "Get" call from the BaseUri "https://osasapi.herokuapp.com" and endpoint "/customers/5fbdd176e6f039001764e69d" 
    And Also verify that I got the users info through HTTP Status code
    Then I want to update the users Info through "Patch"  call from Excel file "Sheet1" for the BaseUri "https://osasapi.herokuapp.com"  and endpoint "/customers/5fbdccd5e6f039001764e698" 
       |C1|C5|
       |D1|D5|
    When verifying I should get an valid HTTP code for updating
    Then I want to delete an user through "Delete" call from the BaseUri "https://osasapi.herokuapp.com" and endpoint "/customers/5fbdccd5e6f039001764e698" 
    And verify that I deleted the users info through HTTP Status code
    