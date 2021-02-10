package io.ttyys.core;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ServiceExecutionAspect {

    @Pointcut("@annotation(io.ttyys.core.Execution)")
    public void exec() {}


}
