package pl.mkubala.qcadoo.academy.state.clients;

import pl.mkubala.qcadoo.academy.Entity;
import pl.mkubala.qcadoo.academy.state.SomeStateChangingService;
import pl.mkubala.qcadoo.academy.state.State;

public class ViewListener {

	private SomeStateChangingService stateService = new SomeStateChangingService();
	
	public void performChange(final Entity entity, final State newState) {
		stateService.changeState(entity, newState);
	}
	
}
