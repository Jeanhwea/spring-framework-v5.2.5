package io.github.jeanhwea.app07_aop.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogEntryAspect {

  @Pointcut("execution(* *.say(..))")
  public void say() {}

  @Before("say()")
  public void beforeSay() {
    System.out.println("beforeSay");
  }

  @After("say()")
  public void afterSay() {
    System.out.println("afterSay");
  }

  @Around("say()")
  public Object aroundSay(ProceedingJoinPoint point) {
    System.out.println("aroundSay/preActions");
    Object obj = null;
    try {
      obj = point.proceed();
    } catch (Throwable e) {
      e.printStackTrace();
    }
    System.out.println("aroundSay/postActions");
    return obj;
  }
}
