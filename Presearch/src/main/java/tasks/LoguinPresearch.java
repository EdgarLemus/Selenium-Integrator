package tasks;

import static Drivers.RemoteWebDriver.driver;
import static pages.LoguinPresearchPages.TXTUSUARIO;

import java.util.Iterator;
import java.util.Set;

import Drivers.RemoteWebDriver;
import interacciones.Escribir;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import pages.LoguinPresearchPages;

public class LoguinPresearch implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;
		
		Set<String> handles = driver.getWindowHandles(); // Obten todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
		
		actor.attemptsTo(Escribir.on("edgar_duvan_l_r@hotmail.com",TXTUSUARIO),
				Escribir.on("20031996Duvan-", LoguinPresearchPages.TXTCONTRASEÑA));
	}

	public static LoguinPresearch on() {
		return Instrumented.instanceOf(LoguinPresearch.class).withProperties();
	}
}