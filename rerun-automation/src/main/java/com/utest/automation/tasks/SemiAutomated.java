package com.utest.automation.tasks;

import com.utest.automation.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SemiAutomated implements Task {

    public static SemiAutomated validate() {
        return Tasks.instrumented(SemiAutomated.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Home.BTN_NOTIFICATIONS, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds()
        );
    }
}
