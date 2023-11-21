Feature: Login

  Scenario Outline: All credentials
 #   Given I open browser
    Given   I go to login page
    When    I type "<email>" email and "<password>" password and clic login button
    Then    I go to addresses page and create new adress by typing "<alias>" alias, "<address>" address, "<city>" city, "<zip>" zip,"<country>" country, "<phone>" phone
    And     I check the correctness of the data
    Examples:
      | email                  | password       | alias  | address     | city         | zip    | country       | phone       |
      | stradlingrad@gmail.com | RobieZakupy03! | AnnSzy | Testerow 14 | Gdziekolwiek | 00-112 | United Kindom | 333 444 555 |