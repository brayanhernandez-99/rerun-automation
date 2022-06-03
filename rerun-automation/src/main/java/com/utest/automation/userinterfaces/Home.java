package com.utest.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target BTN_JOIN_TODAY = Target.the("Register button").locatedBy("//a[contains(@href,'/signup/personal')]/@href");
    public static final Target BTN_LOG_IN = Target.the("Login button").locatedBy("//a[contains(@href,'/login?return_to=')]/@href");

}
