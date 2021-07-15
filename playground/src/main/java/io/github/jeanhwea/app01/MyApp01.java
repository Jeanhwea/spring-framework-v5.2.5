package io.github.jeanhwea.app01;

import io.github.jeanhwea.app01.bean.Author;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp01 {

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
