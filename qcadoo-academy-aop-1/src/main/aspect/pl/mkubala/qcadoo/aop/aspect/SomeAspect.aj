package pl.mkubala.qcadoo.aop.aspect;

import static pl.mkubala.qcadoo.tools.Print.print;

public aspect SomeAspect {

	before() : execution(* *.someMethod()) {
		print("before exec (2)");
	}
	
	pointcut execSomeMethod() : execution(* *.someMethod());
	
	before() : execSomeMethod() {
		print("before exec");
	}
	
	after() : execSomeMethod() {
		print("after exec");
	}
	
}
