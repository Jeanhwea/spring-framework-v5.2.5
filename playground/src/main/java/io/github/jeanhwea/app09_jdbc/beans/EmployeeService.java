package io.github.jeanhwea.app09_jdbc.beans;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeService {
  List<Employee> getAll();
}
