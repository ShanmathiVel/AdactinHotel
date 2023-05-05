@SearchHotel
Feature: Verifying Adactin Hotel Seach Hotel Details

  Scenario Outline: Verifying Adactin HotelSerach By Selecting  All Fields
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNo>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after seach hotel page navigate to "Select Hotel"

    Examples: 
      | userName   | password   | location | hotels         | roomType     | roomNo  | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
      | dinesh1596 | dinesh1596 | Sydney   | Hotel Sunshine | Super Deluxe | 2 - Two | 01/10/2022  | 02/10/2022   | 2 - Two       | 1 - One      |

  Scenario Outline: Verifying Navigation Of Adactin Search Hotel Page By Selecting Only Mandatory Fields
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should enter only mandatory fields of search hotel "<location>","<roomNo>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User should verify after seach hotel page navigate to "Select Hotel"

    Examples: 
      | userName   | password   | location | roomNo  | checkInDate | checkOutDate | adultsPerRoom |
      | dinesh1596 | dinesh1596 | Sydney   | 2 - Two | 01/10/2022  | 02/10/2022   | 2 - Two       |

  Scenario Outline: Verifying  Adactin Search Hotel Page  By Entering Invalid Date Information
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNo>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName   | password   | location | hotels         | roomType     | roomNo  | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
      | dinesh1596 | dinesh1596 | Sydney   | Hotel Sunshine | Super Deluxe | 2 - Two | 24/09/2023  | 24/09/2022   | 2 - Two       | 1 - One      |

  Scenario Outline: Verifying Navigation Of Adactin Search Hotel Page By Without Selecting Hotel Information
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels without selecting hotel information
    Then User should verify location error message "Please Select a Location"

    Examples: 
      | userName   | password   |
      | dinesh1596 | dinesh1596 |
