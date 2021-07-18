package io.github.jeanhwea.app01_application_context.beans;

import org.springframework.beans.factory.annotation.Value;

public class Author {

  @Value("Tim Pope")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
