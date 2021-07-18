package io.github.jeanhwea.app03_reflection.beans;

public class MyController {
  private final MyService myService;

  public MyController(MyService myService) {
    this.myService = myService;
  }

  public String echo() {
    return myService.getMessage();
  }
}
