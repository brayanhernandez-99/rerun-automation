package com.utest.automation.tasks;

import com.utest.automation.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ChangeCurrency implements Task {
    private String currency;

    public ChangeCurrency(String currency) {
        this.currency = currency;
    }

    public static ChangeCurrency to(String currency) {
        return Tasks.instrumented(ChangeCurrency.class, currency);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.BTN_CURRENCY),
                Click.on(Home.SLT_CURRENCY.of(currency))
        );
    }
}
