Feature: Login NopCommerce

Scenario: Valid login test

Given User launch chrome browser
When User Enters URl "https://admin-demo.nopcommerce.com/login"
And User Enters Email as "admin@yourstore.com" Password as "admin"
When Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
And Click on Logout Link
Then Page title should be "Your store. Login"
And User close browser
