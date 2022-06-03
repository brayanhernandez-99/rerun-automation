package com.utest.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {
    public static final Target TXT_EMAIL = Target.the("Text field email address.").locatedBy("//input[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("Text field password.").locatedBy("//input[@id='password']");
    public static final Target LBL_INVALID_LOGIN = Target.the("Label invalid username or password.").locatedBy("//span[contains(text(),'Invalid username or password.')]");
}
