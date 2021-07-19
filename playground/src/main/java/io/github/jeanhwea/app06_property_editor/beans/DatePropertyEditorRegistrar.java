package io.github.jeanhwea.app06_property_editor.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {

  private String dateFormat = "yyyy-MM-dd";

  @Override
  public void registerCustomEditors(PropertyEditorRegistry registry) {
    SimpleDateFormat sdf = new SimpleDateFormat(this.dateFormat);
    registry.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
  }
}
