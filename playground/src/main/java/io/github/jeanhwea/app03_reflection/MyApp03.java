package io.github.jeanhwea.app03_reflection;

import io.github.jeanhwea.app03_reflection.bean.MyController;
import io.github.jeanhwea.app03_reflection.bean.MyService;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyApp03 {

  public static Object prepareService(String message) throws Exception {
    Class<?> serviceClass = Class.forName("io.github.jeanhwea.app03_reflection.bean.MyService");

    Constructor<?> serviceConstructor = serviceClass.getConstructor();
    Object serviceInstance = serviceConstructor.newInstance();

    Field messageField = serviceClass.getDeclaredField("message");
    messageField.setAccessible(true);
    messageField.set(serviceInstance, message);

    return serviceInstance;
  }

  public static Object prepareController(MyService myService) throws Exception {
    Class<?> controllerClass =
        Class.forName("io.github.jeanhwea.app03_reflection.bean.MyController");
    Constructor<?> controllerConstructor = controllerClass.getConstructor(MyService.class);
    Object controllerInstance = controllerConstructor.newInstance(myService);

    Method echoMethod = controllerClass.getMethod("echo");
    String response = (String) echoMethod.invoke(controllerInstance);
    System.out.printf("Reflection call echo(): %s\n", response);
    return controllerInstance;
  }

  public static void main(String[] args) throws Exception {
    MyService myService = (MyService) prepareService("Hello from main");
    MyController myController = (MyController) prepareController(myService);
    System.out.printf("Directly call echo(): %s\n", myController.echo());
  }
}
