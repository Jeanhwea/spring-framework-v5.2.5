package io.github.jeanhwea.app08_bean_post_processor;

import io.github.jeanhwea.app08_bean_post_processor.beans.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(App.class.getPackage().getName());
    User user = ctx.getBean("user", User.class);
    ctx.close();
  }
}
