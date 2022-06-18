package com.utest.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageLogin {
    public static final Target TXT_EMAIL = Target.the("Text field email address.").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("Text field password.").located(By.id("password"));
    public static final Target LBL_INVALID_LOGIN = Target.the("Label invalid username or password.").located(By.xpath("//span[contains(text(),'Invalid username or password.')]"));
}
