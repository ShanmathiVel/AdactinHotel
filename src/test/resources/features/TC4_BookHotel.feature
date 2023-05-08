@BookHotel
Feature: Verifying Adactin Hotel BookHotel Details

  Scenario Outline: Verifying The Book A Hotel Page By Entering All Fields
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNo>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after seach hotel page navigate to "Select Hotel"
    And User should select  hotel name and continue
    Then User should verify success message "Book A Hotel"
    And User enter all fields Book A Hotel "<firstName>","<lastName>","<billingAddress>"
      | cardno           | cardType         | expMonth  | expYear | Cvv |
      | 1234567890123456 | American Express | August    |    2022 | 123 |
      | 1234567890123456 | VISA             | September |    2022 | 234 |
      | 1234567890123456 | Master Card      | October   |    2022 | 345 |
    Then User should verify after booking hotel success message "Booking Confirmation"

    Examples: 
      | userName   | password   | location | hotels         | roomType     | roomNo  | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName | lastName | billingAddress |
      | dinesh1596 | dinesh1596 | Sydney   | Hotel Sunshine | Super Deluxe | 2 - Two | 24/09/2022  | 25/09/2022   | 2 - Two       | 1 - One      | Dinesh    | kumar    | chennai        |

  Scenario Outline: Verifying The Book A Hotel Page By Without Entering All Fields
    Given User is on the Adactin page
    When User should perform Login "<userName>", "<password>"
    Then User should verify after login success message "Hello dinesh1596!"
    And User should search hotels "<location>","<hotels>","<roomType>","<roomNo>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after seach hotel page navigate to "Select Hotel"
    And User should select  hotel name and continue
    Then User should verify success message "Book A Hotel"
    Then User should click Book Now without enter any fiedls
    Then User should verify error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName   | password   | location | hotels         | roomType     | roomNo  | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
      | dinesh1596 | dinesh1596 | Sydney   | Hotel Sunshine | Super Deluxe | 2 - Two | 24/09/2022  | 25/09/2022   | 2 - Two       | 1 - One      |
