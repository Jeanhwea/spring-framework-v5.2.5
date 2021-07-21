package io.github.jeanhwea.app07_aop.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LogEntry {

  @Value("Hello in LogEntry")
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void say() {
    System.out.println("say: " + message);
  }
}
