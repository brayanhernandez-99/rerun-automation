package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.Login.BTN_UNLOCK;

public class ValidateEmailBlocked implements Question {

    public static ValidateEmailBlocked validate() {
        return new ValidateEmailBlocked();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BTN_UNLOCK).answeredBy(actor).toString();
    }
}
