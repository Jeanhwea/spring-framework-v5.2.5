package io.github.jeanhwea.app02_bean_lifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class BeanLife
    implements BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean,
        BeanClassLoaderAware,
        EnvironmentAware,
        EmbeddedValueResolverAware,
        ResourceLoaderAware,
        ApplicationEventPublisherAware,
        MessageSourceAware {

  public BeanLife() {
    System.out.println("BeanLife#<init>()");
  }

  @Override
  public void setBeanName(String name) {
    System.out.println("BeanLife#setBeanName()");
  }

  @Override
  public void setBeanClassLoader(ClassLoader classLoader) {
    System.out.println("BeanLife#setBeanClassLoader()");
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("BeanLife#setBeanFactory()");
  }

  @Override
  public void setEnvironment(Environment environment) {
    System.out.println("BeanLife#setEnvironment()");
  }

  @Override
  public void setEmbeddedValueResolver(StringValueResolver resolver) {
    System.out.println("BeanLife#setEmbeddedValueResolver()");
  }

  @Override
  public void setResourceLoader(ResourceLoader resourceLoader) {
    System.out.println("BeanLife#setResourceLoader()");
  }

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    System.out.println("BeanLife#setApplicationEventPublisher()");
  }

  @Override
  public void setMessageSource(MessageSource messageSource) {
    System.out.println("BeanLife#setMessageSource()");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("BeanLife#setApplicationContext()");
  }

  @Override
  public void afterPropertiesSet() {
    System.out.println("BeanLife#afterPropertiesSet()");
  }

  @Override
  public void destroy() {
    System.out.println("BeanLife#destroy()");
  }
}
