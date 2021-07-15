package io.github.jeanhwea.app02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp02 {

  public static void main(String[] args) {
    System.out.println("==================== BEGIN ====================");
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext("io.github.jeanhwea.app02");
    // ctx.registerBean(BeanLifeBeanPostProcessor.class);
    // ctx.registerBean(BeanLife.class);
    // BeanLife beanLife = ctx.getBean("beanLife", BeanLife.class);
    System.out.println("====================  END  ====================");
  }
}
