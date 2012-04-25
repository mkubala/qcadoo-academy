package pl.mkubala.qcadoo.academy;

import pl.mkubala.qcadoo.academy.state.SomeStateChangingService;
import pl.mkubala.qcadoo.academy.state.State;
import pl.mkubala.qcadoo.academy.state.clients.ExternalSystemConnector;
import pl.mkubala.qcadoo.academy.state.clients.ViewListener;

public class Main {

	public static void main(final String[] args) {
		Entity entity = new Entity();
		
//		entity.setState(State.DELETED);
		
		new SomeStateChangingService().changeState(entity, State.ACCEPTED);
		putLine();
		new ExternalSystemConnector().changeStateToAccepted(entity);
		putLine();
		new ViewListener().performChange(entity, State.DELETED);
	}
	
	private static void putLine() {
		System.out.println("--------------------------------------------");
	}
}
