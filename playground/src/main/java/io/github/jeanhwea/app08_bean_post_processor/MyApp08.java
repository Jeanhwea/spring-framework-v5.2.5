package io.github.jeanhwea.app08_bean_post_processor;

import io.github.jeanhwea.app08_bean_post_processor.beans.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp08 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(MyApp08.class.getPackage().getName());
    User user = ctx.getBean("user", User.class);
    ctx.close();
  }
}
