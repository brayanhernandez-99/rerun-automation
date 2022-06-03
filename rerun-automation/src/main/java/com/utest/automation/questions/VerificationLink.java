package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.Login.BTN_VERIFICATION_LINK;

public class VerificationLink implements Question {

    public static VerificationLink validate() {
        return new VerificationLink();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BTN_VERIFICATION_LINK).answeredBy(actor).toString();
    }
}
