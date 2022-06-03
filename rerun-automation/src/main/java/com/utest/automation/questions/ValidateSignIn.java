package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

import static com.utest.automation.userinterfaces.Home.BTN_NOTIFICATIONS;

public class ValidateSignIn implements Question {

    public static ValidateSignIn validate() {
        return new ValidateSignIn();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(BTN_NOTIFICATIONS).answeredBy(actor).toString();
    }
}
