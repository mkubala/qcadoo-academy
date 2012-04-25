package pl.mkubala.qcadoo.aop;

import static pl.mkubala.qcadoo.tools.Print.print;

public class SomeClass {
	
	public void someMethod() {
		print("hello!");
		somePrivateMethod();
	}
	
	private void somePrivateMethod() {
		print("hello from private method!");
	}
}
