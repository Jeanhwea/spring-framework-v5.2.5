package io.github.jeanhwea.app07_aop.beans;

import org.aspectj.lang.annotation.*;

@Aspect
public class LogEntryAspect {

  @Pointcut("execution(* *.say(..))")
  public void say() {}

  @Before("say()")
  public void beforeSay() {
    System.out.println("beforeSay");
  }
}
