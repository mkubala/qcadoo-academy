package pl.mkubala.qcadoo.academy.policy;

import pl.mkubala.qcadoo.academy.Entity;
import pl.mkubala.qcadoo.academy.state.SomeStateChangingService;
import pl.mkubala.qcadoo.academy.state.State;

public aspect PolicyEnfocementAspect {
	
	declare error
		: call(void Entity.setState(State)) && !within(SomeStateChangingService+) 
		: "Stany zmieniamy tylko w odpowiednim serwisie!";
		
}
