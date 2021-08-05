package io.github.jeanhwea.app07_aop;

import io.github.jeanhwea.app07_aop.beans.LogEntry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext("io.github.jeanhwea.app07_aop.beans");
    LogEntry logEntry = ctx.getBean("logEntry", LogEntry.class);
    logEntry.say();
  }
}
