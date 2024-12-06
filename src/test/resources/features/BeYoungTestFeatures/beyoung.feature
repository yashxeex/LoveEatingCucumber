Feature: User catalogs Beyoung Website

  @Test2
  Scenario Outline: As an end user, he/she select major and sub options from home page
    Given User is on Beyoung website
    When User selects <majorOptions> and <subOptions>
    Examples:
      | majorOptions | subOptions       |
      | Men          | Plain T-Shirts   |
      | Men          | Printed T-Shirts |
      | Men          | Activewear       |
      | WOMEN        | Kurti            |
