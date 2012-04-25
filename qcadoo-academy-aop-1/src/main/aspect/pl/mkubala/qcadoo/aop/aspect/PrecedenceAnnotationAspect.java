package pl.mkubala.qcadoo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclarePrecedence;

//@Aspect
@DeclarePrecedence("pl.mkubala.qcadoo.aop.aspect.SomeAnnotationAspect, pl.mkubala.qcadoo.aop.aspect.PrecedenceAspect")
public class PrecedenceAnnotationAspect {
}
