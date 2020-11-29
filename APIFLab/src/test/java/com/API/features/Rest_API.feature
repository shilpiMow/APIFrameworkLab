Feature: RestAPI Automation

  Scenario: Testing "Get", "Post", "Patch", "Delete" for Rest API 
    Given I send a  "Post" call  to create a new user
      |A2|
    Then I verify that the user is created through HTTP Status code 
    Then I verify all the VAL 
      | VAL | firstName | MD             |
      | VAL | lastName  | IS              |
      
    Then I want to retrieve the users Info through "Get" call 
    And Also verify that I got the users info through HTTP Status code
    Then I verify all the VAL 
      | VAL | firstName | SD     |
      | VAL | lastName  | MN |
    
    Then I want to update the users Info through "Patch"  call 
       |B1|  
    When verifying I should get an valid HTTP code for updating
    Then I verify all the VAL 
      | VAL | firstName | Stylebender              |
      | VAL | lastName  | Last             |
     
    #Then I want to delete an user through "Delete" call 
    #And verify that I deleted the users info through HTTP Status code
    