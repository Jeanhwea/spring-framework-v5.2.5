package io.github.jeanhwea.app02;

import io.github.jeanhwea.app02.lifecycle.BeanLife;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

  public static void main(String[] args) {
    System.out.println("==================== BEGIN ====================");
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanLife.class);
    // BeanLife beanLife = ctx.getBean("beanLife", BeanLife.class);
    System.out.println("====================  END  ====================");
  }
}
