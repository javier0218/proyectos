Feature: Test the shift module

@AtencionInmediata
Scenario: Give an appointment to a patient
  Given    Open browser and start MHO
    When  I Sign in Application
    And   User Should be able to login succesfully
    And   I enter Administrative Management
    And   I enter Module Inmediate Attention
    And   I request a turn with a profesional
    Then  The Inmediate Attention is assigned succesfully  
     
 
	
@TurnoProgramado   
Scenario: Give an appointment to a patient
   Given  Open browser and start MHO
    When  I Sign in Application
    And   User Should be able to login succesfully
    And   I enter Administrative Management
    And   I enter Module Turn
    And   I request a turn with a profesional
    Then  The shift is assigned succesfully 
    
    
    
    

 


        
    
     

  
