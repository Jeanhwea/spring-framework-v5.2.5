package io.github.jeanhwea.app02;

import io.github.jeanhwea.app02.lifecycle.BeanLife;
import io.github.jeanhwea.app02.lifecycle.BeanLifeBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp02 {

  public static void main(String[] args) {
    System.out.println("==================== BEGIN ====================");
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(BeanLifeBeanPostProcessor.class, BeanLife.class);
    // BeanLife beanLife = ctx.getBean("beanLife", BeanLife.class);
    System.out.println("====================  END  ====================");
  }
}
