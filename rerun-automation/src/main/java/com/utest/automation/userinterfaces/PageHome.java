package com.utest.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageHome {
    public static final Target BTN_LOG_IN = Target.the("Login button").located(By.xpath("//a[contains(@href,'/login?return_to=')][1]"));

}
