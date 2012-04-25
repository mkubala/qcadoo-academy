package pl.mkubala.qcadoo.tools.aop;

import pl.mkubala.qcadoo.tools.Print;

public aspect AppendPrintCallerSignatureAspect {

	private pointcut callPrint(final String msg, final Object caller) : call(void Print.print(String)) && args(msg) && this(caller);
	
	void around(final String msg, final Object caller) : callPrint(msg, caller)  {
		proceed(appendSignature(msg, caller), caller);
	}
	
	public String appendSignature(final String message, final Object obj) {
		final String callerSignature = obj.getClass().getSimpleName();
		return new StringBuilder(message).append(" [").append(callerSignature).append("]").toString();
	}
	
}
