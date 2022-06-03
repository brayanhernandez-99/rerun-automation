package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.Login.TXT_EMAIL_INVALID;

public class ValidateEmailInvalid implements Question {

    public static ValidateEmailInvalid validate() {
        return new ValidateEmailInvalid();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_EMAIL_INVALID).answeredBy(actor).toString();
    }
}
