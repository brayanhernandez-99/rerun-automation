package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.Register.TXT_PASSWORDS_NOT_MATCH;

public class ValidatePasswordMatch implements Question {

    public static ValidatePasswordMatch validate() {
        return new ValidatePasswordMatch();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_PASSWORDS_NOT_MATCH).answeredBy(actor).toString();
    }
}
