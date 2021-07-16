package io.github.jeanhwea.app02;

import io.github.jeanhwea.app02.lifecycle.BeanLife;
import io.github.jeanhwea.app02.lifecycle.BeanLifeBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp02 {

  // 扫描包方式
  public static void regBean01() {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext("io.github.jeanhwea.app02");
  }



  public static void main(String[] args) {
    System.out.println("==================== BEGIN ====================");

    // regBean01();
    // regBean02();

    // BeanLife beanLife = ctx.getBean("beanLife", BeanLife.class);
    System.out.println("====================  END  ====================");
  }
}
