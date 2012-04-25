package pl.mkubala.qcadoo.academy.policy;

import pl.mkubala.qcadoo.academy.state.SomeStateChangingService;
import pl.mkubala.qcadoo.academy.state.State;
import pl.mkubala.qcadoo.academy.state.clients.ExternalSystemConnector;

public aspect ExternalSystemRestrictionsAspect {

	void around(final State state) : SomeStateChangingService.SomeClassStateXpi.changingState(state) 
		&& cflow(within(ExternalSystemConnector)) {
		// do nothing just omit join point from execution
	}
	
}
