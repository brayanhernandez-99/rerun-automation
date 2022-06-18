package com.utest.automation.tasks;

import com.utest.automation.models.Login;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.utest.automation.userinterfaces.PageHome.*;
import static com.utest.automation.userinterfaces.PageLogin.*;

import java.util.List;

public class LoginWebSite implements Task {

    private String email;
    private String password;

    public LoginWebSite(List<Login> credentials) {
        this.email = credentials.get(0).getEmail();
        this.password = credentials.get(0).getPassword();
    }

    public static LoginWebSite with(List<Login> credentials) {
        return Instrumented.instanceOf(LoginWebSite.class).withProperties(credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOG_IN),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(password).into(TXT_PASSWORD).thenHit(Keys.ENTER),
                WaitUntil.the(LBL_INVALID_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
