package io.github.jeanhwea;

import io.github.jeanhwea.beans.MyPerson;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext("META-INF/my-beans.xml");

    MyPerson person = ctx.getBean("myPerson", MyPerson.class);
    System.out.println(person.getName());
  }
}
