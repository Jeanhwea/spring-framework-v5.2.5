package io.github.jeanhwea.app05_extent_context;

import io.github.jeanhwea.app01_bean_registration.beans.Author;
import io.github.jeanhwea.app05_extent_context.beans.MyApplicationContext;

public class MyApp05 {

  public static void main(String[] args) {
    MyApplicationContext ctx = new MyApplicationContext("app01-beans.xml");
    Author author1 = ctx.getBean("author", Author.class);
    System.out.println(author1.getName());
  }
}
