package io.github.jeanhwea.app08_bean_post_processor.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class User implements InitializingBean, DisposableBean {

  public User() {
    System.out.println("User#<init>");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("User#afterPropertiesSet");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("User#destroy");
  }
}
