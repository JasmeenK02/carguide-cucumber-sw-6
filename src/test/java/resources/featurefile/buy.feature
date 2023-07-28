Feature: Search functionality
  As a user I want to check search functionality of Website.

  @Smoke
  Scenario Outline: Search the buy car with model

    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<Results>"
    Examples:
      | make       | model       | location            | price | Results    |
      | Land Rover | Discovery 4 | NSW - All           | 70000 | Land Rover |
      | BMW        | 118i        | VIC - All           | 50000 | BMW        |
      | Ford       | Explorer    | NSW - All           | 50000 | Ford       |
      | Honda      | Accord      | NSW - Central Coast | 45000 | Honda      |
      | Kia        | Picanto     | NT - All            | 50000 | Kia        |
      | Jeep       | Cherokee    | NT - All            | 60000 | Jeep       |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<Results>"
    Examples:
      | make       | model       | location            | price | Results    |
      | Land Rover | Discovery 4 | NSW - All           | 70000 | Land Rover |
      | BMW        | 118i        | VIC - All           | 50000 | BMW        |
      | Ford       | Explorer    | NSW - All           | 50000 | Ford       |
      | Honda      | Accord      | NSW - Central Coast | 45000 | Honda      |
      | Kia        | Picanto     | NT - All            | 50000 | Kia        |
      | Jeep       | Cherokee    | NT - All            | 60000 | Jeep       |