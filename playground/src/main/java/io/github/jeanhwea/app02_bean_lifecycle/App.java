package io.github.jeanhwea.app02_bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  ////////////////////////////////////////////////////////////////////////////////
  // 输出结果
  ////////////////////////////////////////////////////////////////////////////////
  // BeanLifeBeanFactoryPostProcessor#postProcessBeanFactory()
  // BeanLife#<init>()
  // BeanLife#setBeanName()
  // BeanLife#setBeanClassLoader()
  // BeanLife#setBeanFactory()
  // BeanLife#setEnvironment()
  // BeanLife#setEmbeddedValueResolver()
  // BeanLife#setResourceLoader()
  // BeanLife#setApplicationEventPublisher()
  // BeanLife#setMessageSource()
  // BeanLife#setApplicationContext()
  // BeanLifeBeanPostProcessor#postProcessBeforeInitialization()
  // BeanLife#afterPropertiesSet()
  // BeanLifeBeanPostProcessor#postProcessAfterInitialization()
  ////////////////////////////////////////////////////////////////////////////////

  public static void main(String[] args) {
    Package pkg = App.class.getPackage();
    String basePackage = pkg.getName();
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(basePackage);
  }
}
