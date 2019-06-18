Feature: Product Search

Scenario: Quick Find product test

Given I am on a oscommerce hompage 
When I enter quick find product "phone"

And I click on Search Button
Then I find realtive search products 