package io.github.jeanhwea.app06_property_editor.beans;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {

  private String dateFormat = "yyyy-MM-dd";

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    SimpleDateFormat sdf = new SimpleDateFormat(this.dateFormat);
    try {
      Date value = sdf.parse(text);
      this.setValue(value);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }
}
