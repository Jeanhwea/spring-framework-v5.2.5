package io.github.jeanhwea.app03_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyApp03 {

  public static void main(String[] args) throws Exception {
    Class<?> clz = Class.forName("io.github.jeanhwea.app03_reflection.bean.Person");

    Constructor<?> ctor = clz.getConstructor();
    Object obj = ctor.newInstance();

    Field field = clz.getDeclaredField("name");
    field.setAccessible(true);
    field.set(obj, "Injected Person Name");

    Method method = clz.getMethod("getName");
    String name = (String) method.invoke(obj);
    System.out.println(name);
  }
}
