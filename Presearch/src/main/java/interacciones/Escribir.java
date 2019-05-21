package interacciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Escribir implements Interaction{

	private String text;
	private Target target;	
	
	public Escribir(String text, Target target) {
		this.text = text;
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(text).into(target));
	}

	public static Performable on(String text, Target target)
	{
		return Instrumented.instanceOf(Escribir.class).withProperties(text,target);
	}
}
