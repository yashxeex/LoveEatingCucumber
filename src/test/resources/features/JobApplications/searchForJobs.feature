Feature: Yash search for Automation Jobs


  @BofAJobSearch
  Scenario Outline: Yash search for multiple jobs via automation
    Given Go to <company> careers website
    When On careers page, search with <location> and <keyword>
#    Then Filter result and send email to myself with screenshots
    Examples:
      | company       | location    | keyword    |
      | bankOfAmerica | Gandhinagar | Automation |