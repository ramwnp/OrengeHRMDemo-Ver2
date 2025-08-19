Feature: My_Info
  Scenario: Enter into My_Info page and enter Personal Details and save
    Given User Launch Crome browser
    When user opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enters userName as "Admin" and password as "admin123"
    And Click on Login
    Then page title should be "OrangeHRM"
    And click on My_info module
    Then page title should be "OrangeHRM"
    And user enter Employee info
    #And click on save button
    #Then user can view confirmation message "The new Employee has been added succesfully"
    #And close browser
