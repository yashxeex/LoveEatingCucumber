Feature: User is able to login with credentials on Rahul Shetty Login Page

 Background:
   Given User is on Rahul Shetty Login Page

 @Test1
 Scenario: User login with correct credentials
   Given User enters "rahulshettyacademy" and "learning"
   When User clicks on Sign In Button
   Then User is able to click on Checkout Button


