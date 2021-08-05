package io.github.jeanhwea.app04_factory_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  ////////////////////////////////////////////////////////////////////////////////
  // 输出结果
  ////////////////////////////////////////////////////////////////////////////////
  // io.github.jeanhwea.app04_factory_bean.beans.Car@76a3e297
  // io.github.jeanhwea.app04_factory_bean.beans.Car@76a3e297
  // io.github.jeanhwea.app04_factory_bean.beans.Car@4d3167f4
  // io.github.jeanhwea.app04_factory_bean.beans.Car@4d3167f4
  // io.github.jeanhwea.app04_factory_bean.beans.CarFactoryBean@ed9d034
  // io.github.jeanhwea.app04_factory_bean.beans.CarFactoryBean@ed9d034
  ////////////////////////////////////////////////////////////////////////////////

  public static void main(String[] args) {
    Package pkg = App.class.getPackage();
    String basePackage = pkg.getName();
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(basePackage);

    Object car01 = ctx.getBean("car");
    Object car02 = ctx.getBean("car");
    Object car03 = ctx.getBean("carFactoryBean");
    Object car04 = ctx.getBean("carFactoryBean");
    Object car05 = ctx.getBean("&carFactoryBean");
    Object car06 = ctx.getBean("&carFactoryBean");
    System.out.println(car01);
    System.out.println(car02);
    System.out.println(car03);
    System.out.println(car04);
    System.out.println(car05);
    System.out.println(car06);
  }
}
