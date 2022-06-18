package com.utest.automation.tasks;

import com.utest.automation.userinterfaces.Home;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.utest.automation.userinterfaces.Login.*;

import java.util.List;
import java.util.Map;

public class LoginWebSite implements Task {

    private String email;
    private String password;

    public LoginWebSite(List<Map<String, String>> credentials) {
        this.email = credentials.get(0).get(email);
        this.password = credentials.get(0).get(password);
    }

    public static LoginWebSite with(List<Map<String, String>> credentials) {
        return Instrumented.instanceOf(LoginWebSite.class).withProperties(credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.BTN_LOG_IN),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(password).into(TXT_PASSWORD).thenHit(Keys.ENTER),
                WaitUntil.the(LBL_INVALID_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
