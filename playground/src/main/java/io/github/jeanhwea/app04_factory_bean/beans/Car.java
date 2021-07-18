package io.github.jeanhwea.app04_factory_bean.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {
  private String brand;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}
