Feature: RestAPI Automation

    #Then I want to update the users Info through "Patch"  call 
       #|B1|  
     #get call, retrive id, then patch request using the body, verify status code then get send get request
    #When verifying I should get an valid HTTP code for updating
    #Then I verify all the VAL 
      #| VAL | firstName | Stylebender              |
      #| VAL | lastName  | Last             |
     #
    #Then I want to delete an user through "Delete" call 
    #And verify that I deleted the users info through HTTP Status code
    
    #Scenario: As a User I should be able to see my registration information by using get call
    #
    #Given I send a "GET" request using "/customers/5fbdb277e6f039001764e694" 
    #Then I verify the following fields
    #| VALIDATOR | _id | 5fbdb277e6f039001764e694   |
    #| VALIDATOR | firstName | Shuvo   |
    #| VALIDATOR | lastName| Dash |
    #| VALIDATOR | phone | 3475674589  |
    #| VALIDATOR | email| Md789@gmail.com |
    #And  I verify the HTTP status code for "get"
    
    Scenario: As a User I should be able to see my registration information by using post call
    
    Given I send a "POST" request  by using "/customers" 
    |Book1.xlsx|A1|
    |VAR|_id|
    #Then  I send a "GET" request using "/customers/{_id}" 
    Then I verify the following fields
    | VALIDATOR | _id | 5fbdb277e6f039001764e694   |
    | VALIDATOR | firstName | Kane   |
    | VALIDATOR | lastName| Willamson |
    | VALIDATOR | phone | 3474563262  |
    | VALIDATOR | email|Kwillamson55@gmail.com |
    And I verify the HTTP status code for "post"
    
      
      
      
    
    
    
    
    
    
    
    
    