#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Sample

  @tag1
  Scenario: launch the browser
    Given user launch chrome browser
    When user enter username as 'abc' and password as 'vuip123'
    And click on submit button
    Then user should be login
    And browser should be closed

    @tag1
  Scenario Outline: launch the browser
    Given user launch chrome browser
    When user enter username as '<uNmae>' and password as '<Passd>'
    And click on submit button
    Then user should be login
    And browser should be closed
    Examples:
    |uNmae|Passd|
    |vipu1@gmail|vuip123|
    |vipu2@gmail|vuip1234|
    |vipu3@gmail|vuip1235|
    |vipu4@gmail|vuip1236|
