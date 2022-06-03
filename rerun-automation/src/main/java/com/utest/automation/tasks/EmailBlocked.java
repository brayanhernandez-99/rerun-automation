package com.utest.automation.tasks;

import com.utest.automation.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.utest.automation.userinterfaces.Login.LBL_EMAIL;
import static com.utest.automation.userinterfaces.Login.BTN_UNLOCK;

public class EmailBlocked implements Task {
    private String email_blocked;

    public EmailBlocked(String email_blocked) {
        this.email_blocked = email_blocked;
    }

    public static EmailBlocked validate(String email_blocked) {
        return Tasks.instrumented(EmailBlocked.class, email_blocked);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.BTN_SIGN_IN),
                Enter.theValue(email_blocked).into(LBL_EMAIL).thenHit(Keys.ENTER),
                WaitUntil.the(BTN_UNLOCK, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds()
        );
    }
}