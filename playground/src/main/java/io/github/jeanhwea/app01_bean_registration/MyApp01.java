package io.github.jeanhwea.app01_bean_registration;

import io.github.jeanhwea.app01_bean_registration.beans.Author;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp01 {

  // 方法一: XML 方式
  public static void regBean01() {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("my-beans.xml");
    Author author1 = ctx.getBean("author", Author.class);
    System.out.println(author1.getName());
  }

  // 方法二: 注解方式
  public static void regBean02() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Author.class);
    Author author2 = ctx.getBean("author", Author.class);
    System.out.println(author2.getName());
  }

  // 方法三: 调用 registerBean 方法注册
  public static void regBean03() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.registerBean(Author.class);
    ctx.refresh();
    Author author3 = ctx.getBean("author", Author.class);
    System.out.println(author3.getName());
  }

  // 方法四: 使用 BeanDefinition 注册
  private static void regBean04() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    AbstractBeanDefinition beanDefinition =
        BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
    beanDefinition.setBeanClass(Author.class);
    ctx.registerBeanDefinition("author", beanDefinition);
    ctx.refresh();
    Author author4 = ctx.getBean("author", Author.class);
    System.out.println(author4.getName());
  }

  // 方法五: 使用 Supplier 方式创建
  private static void regBean05() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    AbstractBeanDefinition beanDefinition =
        BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
    beanDefinition.setBeanClass(Author.class);
    beanDefinition.setInstanceSupplier(Author::new);
    ctx.registerBeanDefinition(Author.class.getSimpleName(), beanDefinition);
    ctx.refresh();
    Author author5 = ctx.getBean(Author.class.getSimpleName(), Author.class);
    System.out.println(author5.getName());
  }

  public static void main(String[] args) {
    regBean01();
    regBean02();
    regBean03();
    regBean04();
    regBean05();
  }
}
