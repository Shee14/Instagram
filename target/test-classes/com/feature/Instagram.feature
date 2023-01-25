Feature: Login Function Automation Testcase

Background: 
Given User "Chrome" Browser Launch
And User website Url "https://www.instagram.com/"
And User Verify Login Page landed

Scenario: Instagram Login with Invalid Id and Password

And User Enter Invalid Username <Username>
And User Enter Invalid Password <Password>
And User Click Login Button
And User Verify Invalid Login Message "There was a problem logging you into Instagram. Please try again soon."
Then User Verify Login is Successful


Examples: 
|Username|Password|
|"Invalid Username"|"Valid Password"|
|"Valid Username"|"Invalid Password"|
|"Invalid Username"|"Invalid Password"|
 