Feature: Product Page

Scenario: Able to view product page
Users should be able to view details on the product page

Given I am on the product page
When I look
Then I should see the product title
And I should see the thumbnail image
And I should see the price
And I should see the ratings
And I should see the reviews