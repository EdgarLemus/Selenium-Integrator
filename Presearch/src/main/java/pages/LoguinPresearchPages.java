package pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoguinPresearchPages {

	public static final Target TXTUSUARIO = Target.the("").located(By.xpath("//div[@id='login-form']//input[@name = 'email']"));
	public static final Target TXTCONTRASEÑA = Target.the("").located(By.xpath("//div[@id='login-form']//input[@name = 'password']"));
}
