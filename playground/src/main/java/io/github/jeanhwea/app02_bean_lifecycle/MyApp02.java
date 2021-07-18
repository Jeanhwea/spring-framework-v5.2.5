package io.github.jeanhwea.app02_bean_lifecycle;

import io.github.jeanhwea.app02_bean_lifecycle.beans.BeanLife;
import io.github.jeanhwea.app02_bean_lifecycle.beans.BeanLifeBeanPostProcessor;
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
