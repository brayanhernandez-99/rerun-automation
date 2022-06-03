package com.utest.automation.tasks;

import com.utest.automation.models.Register;
import com.utest.automation.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class RegisterAccount implements Task {

    private String email;
    private String new_password;
    private String confirm_password;

    public RegisterAccount(List<Register> credentials) {
        this.email = credentials.get(0).getEmail();
        this.new_password = credentials.get(0).getNew_password();
        this.confirm_password = credentials.get(0).getConfirm_password();
    }

    public static RegisterAccount register(List<Register> credentials) {
        return Tasks.instrumented(RegisterAccount.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.BTN_REGISTER),
                Enter.theValue(email).into(com.utest.automation.userinterfaces.Register.LBL_EMAIL).thenHit(Keys.ENTER),
                Enter.theValue(new_password).into(com.utest.automation.userinterfaces.Register.LBL_NEW_PASSWORD),
                Enter.theValue(confirm_password).into(com.utest.automation.userinterfaces.Register.LBL_CONFIRMED_PASSWORD).thenHit(Keys.ENTER)
        );
    }
}
