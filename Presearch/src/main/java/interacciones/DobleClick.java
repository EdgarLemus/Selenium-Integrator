package interacciones;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;

import Drivers.RemoteWebDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class DobleClick implements Interaction{

	private Target target;

	public DobleClick(Target target) {
		super();
		this.target = target;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		Actions actions = new Actions(RemoteWebDriver.driver);
		WebElement element = target.resolveFor(actor);
		actions.doubleClick(element).perform();
	}

	public static Performable on(Target target)
	{
		return Instrumented.instanceOf(DobleClick.class).withProperties(target);
	}
}
