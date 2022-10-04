Feature: check login with valid credentials

  Scenario Outline: check login with valid credentials
    Given user should be in adactin login page
    When user should enter valid "<username>","<password>"
    And user should click login button
    Then user should verify the login success message as "Hello Greens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: check login with invalid credentials
    Given user should be in adactin login page
    When user should enter valid "<username>","<password>"
    And user should click login button
    Then user should verify the login is not success message contains "Invalid Login"

    Examples: 
      | username     | password |
      | Greens876257 | L4R73935 |
