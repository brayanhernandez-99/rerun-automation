package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.automation.userinterfaces.Login.LBL_INVALID_LOGIN;

public class InvalidCredentials implements Question {

    public static InvalidCredentials validate() {
        return new InvalidCredentials();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_INVALID_LOGIN).answeredBy(actor).toString();
    }
}
