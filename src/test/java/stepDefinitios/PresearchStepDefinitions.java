package stepDefinitios;

import Drivers.RemoteWebDriver;
import cucumber.api.java.en.Given;
import interacciones.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import tasks.LoguinPresearch;

public class PresearchStepDefinitions {

	public static Actor actor = new Actor("Duvan");

	@Given("^That I'm into Presearch$")
	public void thatIMIntoPresearch() {
		actor.can(BrowseTheWeb.with(RemoteWebDriver.chromeHisBrowserWeb().on("https://www.presearch.org/")));
		RemoteWebDriver.driver.switchTo().defaultContent().toString();
	}


	@Given("^I'm login$")
	public void iMLogin() {
		actor.attemptsTo(LoguinPresearch.on(),Esperar.estos(60));
	}
}
