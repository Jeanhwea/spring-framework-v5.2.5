package io.github.jeanhwea.app06_property_editor.beans;

import java.util.Date;

public class UserManager {
  private Date dateValue;

  public Date getDateValue() {
    return dateValue;
  }

  public void setDateValue(Date dateValue) {
    this.dateValue = dateValue;
  }

  @Override
  public String toString() {
    return "dateValue: " + dateValue;
  }
}
