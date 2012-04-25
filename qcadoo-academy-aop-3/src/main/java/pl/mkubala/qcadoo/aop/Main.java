package pl.mkubala.qcadoo.aop;

import java.util.List;

import com.google.common.collect.Lists;

public class Main {

	public static void main(final String... args) {
		Main main = new Main();
		main.someMethod(false);
		main.someMethod(true);
	}
	
	public List<String> someMethod(final boolean returnNull) {
		if (returnNull) {
			return null;
		}
		return Lists.newArrayList();
	}
}
