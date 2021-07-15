package io.github.jeanhwea.app02;

import io.github.jeanhwea.app02.lifecycle.BeanLife;
import io.github.jeanhwea.app02.lifecycle.BeanLifeBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp02 {

  public static void main(String[] args) {
    System.out.println("==================== BEGIN ====================");

    // AnnotationConfigApplicationContext ctx =
    //     new AnnotationConfigApplicationContext("io.github.jeanhwea.app02");

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.registerBean(BeanLifeBeanPostProcessor.class);
    ctx.registerBean(BeanLife.class);
    ctx.refresh();

    // BeanLife beanLife = ctx.getBean("beanLife", BeanLife.class);
    System.out.println("====================  END  ====================");
  }
}
