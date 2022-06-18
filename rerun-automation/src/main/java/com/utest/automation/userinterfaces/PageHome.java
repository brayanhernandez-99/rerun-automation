package com.utest.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageHome {
    public static final Target BTN_LOG_IN = Target.the("Login button").locatedBy("//a[contains(@href,'/login?return_to=')]");

}
