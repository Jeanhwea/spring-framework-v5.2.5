package io.github.jeanhwea.app10_web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyApp10 {

  public static void main(String[] args) {
    String pkgname = MyApp10.class.getPackage().getName();
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(pkgname);
  }
}
