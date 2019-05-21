package util;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectOptions implements Interaction{

	private Target target,option;
	
	public SelectOptions(Target target, Target option) {
		this.target = target;
		this.option = option;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target),Click.on(option));		
	}
	
	public static Performable on(Target target, Target option)
	{
		return Instrumented.instanceOf(SelectOptions.class).withProperties(target,option);
	}
}
