package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.Home.LBL_CURRENCY;

public class ValidateChangeCurrency implements Question {

    public static ValidateChangeCurrency validate() {
        return new ValidateChangeCurrency();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_CURRENCY).answeredBy(actor).toString();
    }
}
