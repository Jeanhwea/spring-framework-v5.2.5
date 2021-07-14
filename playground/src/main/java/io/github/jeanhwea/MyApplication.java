package io.github.jeanhwea;

import io.github.jeanhwea.bean.Author;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext("META-INF/my-beans.xml");

    Author person = ctx.getBean("author", Author.class);
    System.out.println(person.getName());
  }
}
