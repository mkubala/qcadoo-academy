package pl.mkubala.qcadoo.aop;

import static pl.mkubala.qcadoo.tools.Print.print;

import java.util.List;

import pl.mkubala.qcadoo.tools.Print;

import com.google.common.collect.Lists;

public class Main {

	public static void main(final String... args) {
		Main main = new Main();
		main.a("wormhole");
	}
	
	public void a(final String arg) {
		b();
	}
	
	public void b() {
		c();
	}
	
	public void c() {
		d(null);
	}
	
	public void d(final String arg) {
		print(arg);
	}
	
}
