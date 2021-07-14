package io.github.jeanhwea;

import io.github.jeanhwea.bean.Author;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx1 =
        new ClassPathXmlApplicationContext("META-INF/my-beans.xml");
    Author author1 = ctx1.getBean("author", Author.class);
    System.out.println(author1.getName());

    AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Author.class);
    Author author2 = ctx2.getBean("author", Author.class);
    System.out.println(author2.getName());
  }
}
