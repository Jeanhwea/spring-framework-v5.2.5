package io.github.jeanhwea.app10_web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp10 {

  public static void main(String[] args) {
    String pkgname = MyApp10.class.getPackage().getName();
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(pkgname);

    // DispatcherServlet servlet = new DispatcherServlet(ctx);
    // ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
    // registration.setLoadOnStartup(1);
    // registration.addMapping("/app/*");
  }
}
