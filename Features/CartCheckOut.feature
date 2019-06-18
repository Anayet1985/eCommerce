Feature: CheckOut

@CartContents
Scenario: User wants to add a product his cart Contents

Given The user is on product page 
When He clicks on of product 
And He clicks the Add to Cart Button 
Then one of product added his Cart Contents

@CheckOut
Scenario: User wants to check out his select product 

Given User select the product 
When User click add to cart
And He clicks checkout button 
Then User see check out page appeard 
