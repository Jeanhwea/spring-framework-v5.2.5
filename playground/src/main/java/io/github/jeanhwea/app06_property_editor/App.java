package io.github.jeanhwea.app06_property_editor;

import io.github.jeanhwea.app06_property_editor.beans.UserManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app06-beans.xml");
    UserManager userManager = ctx.getBean("userManager", UserManager.class);
    System.out.println(userManager);
  }
}
