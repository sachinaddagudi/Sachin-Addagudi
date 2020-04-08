@softpedia
Feature: softpedia Website

  @TC01_01
 Scenario Outline: Checks login page of Softpedia
Given I launch Chrome browser
When Login Softpedia page opened
Then enter "<username>" and "<password>" in the login field
Then Click on the login button
Then Takes a screenshot

Examples:

|username|                                   |password|
|sachin.addagudi@gmail.com|                           |sachin10| 

 @TC01_02
 Scenario Outline: Registers new user in softpedia
Given  TC01_02 I launch Chrome browser
When  TC01_02 Login Softpedia page opened
Then  TC01_02 Click n register buttton
Then TC01_02 enter "<Username>" "<password>" "<EmailID>" "<Confirm password>" in the login field
Then  TC01_02 Click on regiter button
Then TC01_02 click on done
Then  TC01_02Takes a screenshot


Examples:

|Username|                 |password|	|EmailID|					 |Confirm password|
|Vayumihir29|          |Cast3456|	|sachinaddagudi@gmail.com|	 |Cast3456|


  @TC01_03
 Scenario Outline: Checks news and reviews of Softpedia
Given News I launch Chrome browser
Then News Click on the News button
Then News Click on the Mobile button
Then News Click on the Mobileapps button
Then News Takes a ScreenShot

Examples:

|username|                                   |password|
|sachin.addagudi@gmail.com|                           |sachin10| 


@TC01_04
 Scenario Outline: Checks Ratings of antivirus in  Softpedia
Given Ratings I launch Chrome browser
Then RatingsClick on the News button
Then Ratings Click on the Mobile button
Then Ratings Click on the Mobileapps button
Then Ratings Takes a ScreenShot

Examples:

|username|                                   |password|
|sachin.addagudi@gmail.com|                           |sachin10|