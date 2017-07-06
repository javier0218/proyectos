Feature: Test Login MHO

   
    
  @Login
  Scenario: Login MHO
    Given Open browser and start MHO
    When  I enter a valid "jpizarro" and valid "aaa"
    Then  User Should be able to login succesfully
    

   
    