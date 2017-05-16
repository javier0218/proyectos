Feature: Probar el modulo Turnos 

@TurnAdm
Scenario: Enter turn module
 Given Open browser and start MHO
    When  I enter a valid "ggoya" and valid "azrael"
    And   User Should be able to login succesfully
    And   I enter Administrative Management
    And   I enter Module Turn
    
    

