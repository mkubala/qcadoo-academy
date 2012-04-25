package pl.mkubala.qcadoo.academy.policy;

import pl.mkubala.qcadoo.academy.Entity;
import pl.mkubala.qcadoo.academy.state.SomeStateChangingService;
import pl.mkubala.qcadoo.academy.state.State;
import pl.mkubala.qcadoo.tools.Print;

public aspect StateMonitoringAspect {
	
	private pointcut fireStateChange(final Entity entity) : 
		call(* SomeStateChangingService.changeState(Entity, State)) && args(entity, *);
	
	before(final Entity entity) : fireStateChange(entity) {
		new SomeStateChangingService().resetState(entity);
	}
	
	Object around(Entity entity) : fireStateChange(entity) {
		Print.print("state before: " + entity.getState());
		Object ret = proceed(entity);
		Print.print("state after: " + entity.getState());
		return ret;
	}
}


