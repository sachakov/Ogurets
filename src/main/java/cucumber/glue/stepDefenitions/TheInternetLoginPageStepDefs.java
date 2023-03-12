package cucumber.glue.stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TheInternetLoginPageStepDefs {

        @Given("^user open the internet login page$")//начало и конец строки как в РЕГУЛЯРКАх, без этого мож не робетать
        public void userOpensLoginPage(){
        System.out.println("hello world");
        }

       // @When("user enters 'tomsmith' in login field and 'SuperSecretPassword!' in password field") было так изначально, потом логин сделали в виде регуллярки
        @When("^user enters '(.*)' in login field and '(.*)' in password field$")
        public void userEntersCredentials(String login, String password){
        //если ходим из этой стринги достать логин и пароль, то или РЕГУЛЯРКА или CUCUMBER выражения
            System.out.println(login +" " +  password);
        }
        @Then("user enters '<login>' in login field and '<password>' in password field")
    public void userSeesErrorMessage(){
        //если ходим из этой стринги достать логин и пароль, то или РЕГУЛЯРКА или CUCUMBER выражения
        System.out.println("Error Message");
    }

}
