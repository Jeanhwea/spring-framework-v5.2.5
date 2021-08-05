package io.github.jeanhwea.app10_web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    String pkgname = App.class.getPackage().getName();
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(pkgname);
  }
}
