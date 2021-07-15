package io.github.jeanhwea.app02.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

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

  @Override
  public void setBeanName(String name) {
    System.out.println("setBeanName");
  }

  @Override
  public void setBeanClassLoader(ClassLoader classLoader) {
    System.out.println("setBeanClassLoader");
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("setBeanFactory");
  }

  @Override
  public void setEnvironment(Environment environment) {
    System.out.println("setEnvironment");
  }

  @Override
  public void setEmbeddedValueResolver(StringValueResolver resolver) {
    System.out.println("setEmbeddedValueResolver");
  }

  @Override
  public void setResourceLoader(ResourceLoader resourceLoader) {
    System.out.println("setResourceLoader");
  }

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    System.out.println("setApplicationEventPublisher");
  }

  @Override
  public void setMessageSource(MessageSource messageSource) {
    System.out.println("setMessageSource");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("setApplicationContext");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("afterPropertiesSet");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("destroy");
  }
}
