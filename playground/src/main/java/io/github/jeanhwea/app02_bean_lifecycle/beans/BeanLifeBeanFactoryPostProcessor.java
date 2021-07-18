package io.github.jeanhwea.app02_bean_lifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    BeanDefinition bd = beanFactory.getBeanDefinition("beanLife");
    if (bd != null) {
      System.out.println("BeanLifeBeanFactoryPostProcessor#postProcessBeanFactory()");
    }
  }
}
