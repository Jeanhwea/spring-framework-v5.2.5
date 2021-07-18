package io.github.jeanhwea.app02_bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp02 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext("io.github.jeanhwea.app02");
  }
}
