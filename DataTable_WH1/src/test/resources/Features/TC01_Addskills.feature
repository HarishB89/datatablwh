Feature: i am automating orange HRM application 

Background: common re-usable steps

Given user launch browser
Then user enter URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC01_AddSkills record

And user enters login details

|Username|Password|
|Admin|admin123|


Then go to skills page
Then user enters skills details

|SkillName|SkillDesc|
|Selenium1|Selenium1 desc|
|Selenium2|Selenium2 desc|
|Selenium3|Selenium3 desc|


Then logout
Then close browser