package io.github.jeanhwea.app03_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MyApp03 {

  public static Object prepareService(String message) throws Exception {
    Class<?> clz = Class.forName("io.github.jeanhwea.app03_reflection.bean.MyService");

    Constructor<?> ctor = clz.getConstructor();
    Object obj = ctor.newInstance();

    Field field = clz.getDeclaredField("message");
    field.setAccessible(true);
    field.set(obj, message);

    // Method method = clz.getMethod("getMessage");
    // String name = (String) method.invoke(obj);
    return obj;
  }

  public static void main(String[] args) throws Exception {
    // System.out.println(name);
  }
}
