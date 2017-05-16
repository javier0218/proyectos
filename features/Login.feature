Feature: Test Login MHO

  @Tag1
  Scenario Outline: Login MHO
    Given Open browser and start MHO
    When  I enter a valid "<username>" and valid "<password>"
    Then  User Should be able to login succesfully
    And   Application should be closed

    Examples: 
      | username | password |
      | jpizarro | abc123   |
      | ggoya    | azrael   |
      | mdiaz    | majadi   |

    
    
 @login
  Scenario: Login MHO
    Given Open browser and start MHO
    When  I enter a valid "jpizarro" and valid "abc123"
    Then  User Should be able to login succesfully
    

   
    