@SelectHotel
Feature: Verifying Adactin Hotel SelectHotel Details

  Scenario Outline: Verifying The SelectHotel Page By Selecting Hotelname
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNo>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after seach hotel page navigate to "Select Hotel"
    And User should select  hotel name and continue
    Then User should verify success message "Book A Hotel"

    Examples: 
      | userName   | password   | location | hotels         | roomType     | roomNo  | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
      | dinesh1596 | dinesh1596 | Sydney   | Hotel Sunshine | Super Deluxe | 2 - Two | 24/09/2022  | 25/09/2022   | 2 - Two       | 1 - One      |

  Scenario Outline: Verifying The SelectHotel Page By Not Selecting Hotelname
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNo>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after seach hotel page navigate to "Select Hotel"
    And User should  without select  hotel name and continue
    Then User should verify select hotel error message "Please Select a Hotel"

    Examples: 
      | userName   | password   | location | hotels         | roomType     | roomNo  | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
      | dinesh1596 | dinesh1596 | Sydney   | Hotel Sunshine | Super Deluxe | 2 - Two | 24/09/2022  | 25/09/2022   | 2 - Two       | 1 - One      |
