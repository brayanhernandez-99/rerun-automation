package com.utest.automation.stepdefinitions;

import com.utest.automation.exceptions.MessageNotMatchException;
import com.utest.automation.models.Login;
import com.utest.automation.questions.InvalidCredentials;
import com.utest.automation.tasks.LoginWebSite;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.utest.automation.utils.EndPoints.UTEST;

public class UtestStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("User");
    }

    @Given("the user is in the page Utest")
    public void theUserIsInThePageUtest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(UTEST));
    }

    @When("the user enter email and password")
    public void theUserEnterEmailAndPassword(List<Login> credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginWebSite.with(credentials));
    }

    @Then("the user will see {string}")
    public void theUserWillSee(String invalidCredentials) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(InvalidCredentials.validate(), Matchers.equalTo(invalidCredentials)).orComplainWith(MessageNotMatchException.class, "The username or password invalid."));
    }

}
