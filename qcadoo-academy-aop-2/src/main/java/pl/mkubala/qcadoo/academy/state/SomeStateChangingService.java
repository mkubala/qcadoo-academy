package pl.mkubala.qcadoo.academy.state;

import static pl.mkubala.qcadoo.tools.Print.print;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import pl.mkubala.qcadoo.academy.Entity;


public class SomeStateChangingService {

	public void changeState(final Entity entity, final State state) {
		print("Changing state from " + entity.getState() + " to " + state);
		entity.setState(state);
	}
	
	public void resetState(final Entity entity) {
		entity.setState(State.DRAFT);
	}
	
	@Aspect
	public static class SomeClassStateXpi {
		
		@Pointcut("execution(void SomeStateChangingService.changeState(*, State)) && args(*, newState)")
		public void changingState(final State newState) {}
	}
}
