package pl.mkubala.qcadoo.aop.aspect;

import java.util.Collection;
import java.util.Map;

import pl.mkubala.qcadoo.tools.Print;

public aspect PolicyEnforcementAspect {

	after() returning(final Object retValue) : execution((Collection+ || Map+) *.*(..)) {
		if (retValue == null) {
			Print.print("Metoda zwraca null zamiast pustej kolekcji/mapy! \n\t" + thisJoinPointStaticPart.getSignature().toLongString());
		}
	}
	
}
