package pl.mkubala.qcadoo.academy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import pl.mkubala.qcadoo.academy.state.State;
import pl.mkubala.qcadoo.tools.Print;

@Aspect
public class Listener {

	public void notifyMeBefore(final State newState) {
		Print.print("Before changing state to " + newState);
	}
	
	public void notifyMeAfter(final State newState) {
		Print.print("After changing state to " + newState);
	}
	
	@Before("pl.mkubala.qcadoo.academy.state.SomeStateChangingService.SomeClassStateXpi.changingState(someState)")
	public void fireListener(final State someState) {
		notifyMeBefore(someState);
	}
}
