Feature: Log in
  As a non logged user
  I want to log in
  So I can use the Internet

  @SecondBefore
  Scenario: Valid login test
    Given user open the internet login page
    When user enters 'tomsmith' in login field and 'SuperSecretPassword!' in password field
   #And clicks 'Login' button
   #Then user is logged ine

#ниже аналог ДатаПровайдера (этот как а ТестНГ, когда надо использовать набор данных логин/пароль например

  Scenario Outline: Negative login test
    #Given user open the internet login page
    When user enters '<login>' in login field and '<password>' in password field
    #And clicks 'Login' button
    #Then user sees the error message 'blah'

    Examples:
    |login|password|
    |login1 |querty1|
    |login2 |querty2|
    |login3 |querty3|