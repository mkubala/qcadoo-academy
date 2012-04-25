package pl.mkubala.qcadoo.academy.state.clients;

import pl.mkubala.qcadoo.academy.Entity;
import pl.mkubala.qcadoo.academy.state.SomeStateChangingService;
import pl.mkubala.qcadoo.academy.state.State;

public class ExternalSystemConnector {

	private SomeStateChangingService stateService = new SomeStateChangingService();
	
	public void changeStateToAccepted(final Entity entity) {
		stateService.changeState(entity, State.ACCEPTED);
	}
}
