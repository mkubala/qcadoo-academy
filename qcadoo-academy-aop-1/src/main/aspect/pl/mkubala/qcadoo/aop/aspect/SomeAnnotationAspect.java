package pl.mkubala.qcadoo.aop.aspect;

import static pl.mkubala.qcadoo.tools.Print.print;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class SomeAnnotationAspect {

	@Before("execution(* *.someMethod())")
	public void beforeExecAnonymousPointcut() {
		print("before exec (2)");
	}
	
	@Pointcut("execution(* *.someMethod())")
	public void execSomeMethod() {
	}
	
	@Before("execSomeMethod()")
	public void beforeExecSomeMethodOrOtherAwesomeName() {
		print("before exec");
	}
	
	@After("execSomeMethod()")
	public void afterExecSomeMethodOrOtherAwesomeName() {
		print("after exec");
	}
}
