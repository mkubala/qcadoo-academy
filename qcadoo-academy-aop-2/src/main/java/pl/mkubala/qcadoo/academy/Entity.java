package pl.mkubala.qcadoo.academy;

import pl.mkubala.qcadoo.academy.state.State;

public class Entity {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(final State state) {
		this.state = state;
	}
	
	
}
