package io.github.jeanhwea.bean;

import org.springframework.beans.factory.annotation.Value;

public class Author {

  @Value("Tom Wang")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
