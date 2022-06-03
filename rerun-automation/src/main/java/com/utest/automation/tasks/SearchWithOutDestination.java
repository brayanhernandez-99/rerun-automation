package com.utest.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchWithOutDestination implements Task {

    public static SearchWithOutDestination search() {
        return Tasks.instrumented(SearchWithOutDestination.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReserveStays.BTN_SEARCH)
        );
    }
}
