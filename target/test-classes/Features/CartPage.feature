Feature: Cart Page Feature
Background: User already logged in
  Given User on login page
  When User enters email "beratsonmz@gmail.com"
  And User enters password "Catimnagt.1.2.3"
  Then User clicks on login button

  Scenario: Add product to cart and validate
    Given User on homepage
    And User search for "DJI Mavic 2 Pro Fly More Kit"
    And User add related product to cart
    When User goes to cart page
    Then Shopping cart should contain "DJI Mavic 2 Pro Fly More Kit"