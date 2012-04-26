package pl.mkubala.qcadoo.aop.aspect;

import pl.mkubala.qcadoo.aop.Main;

public aspect WormholePatternAspect {

	pointcut execA(final String aArg) : execution(* Main.a(..)) && args(aArg);
	
	pointcut execD(final String dArg) : if(dArg == null) && execution(* Main.d(..)) && args(dArg);
	
	Object around(final String aArg, final String dArg) : execD(dArg) && cflow(execA(aArg)) {
		return proceed(aArg, aArg);
	}
	
}
