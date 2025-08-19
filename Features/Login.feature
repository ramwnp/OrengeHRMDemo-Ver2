Feature: Login
  Scenario: Succesfull Login with Valid Credentials
    Given User Launch Crome browser
    When user opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enters userName as "Admin" and password as "admin123"
    And Click on Login
    Then page title should be "OrangeHRM"
    And Click on userDrodown link
    When user click on Logout link
    Then page title should be "OrangeHRM"
    And close browser