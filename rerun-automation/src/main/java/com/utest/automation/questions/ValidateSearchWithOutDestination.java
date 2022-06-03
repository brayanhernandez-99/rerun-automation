package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.ReserveStays.TXT_ERROR_SEARCH;

public class ValidateSearchWithOutDestination implements Question {

    public static ValidateSearchWithOutDestination validate() {
        return new ValidateSearchWithOutDestination();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_ERROR_SEARCH).answeredBy(actor).toString();
    }
}
