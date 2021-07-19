package io.github.jeanhwea.app05_extent_context.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext extends ClassPathXmlApplicationContext {

  public MyApplicationContext(String... configLocations) throws BeansException {
    super(configLocations);
  }

  @Override
  protected void initPropertySources() {
    super.initPropertySources();
    // getEnvironment().setRequiredProperties("PATH");
  }
}
