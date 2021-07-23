package io.github.jeanhwea.app09_jdbc;

import io.github.jeanhwea.app09_jdbc.beans.Employee;
import io.github.jeanhwea.app09_jdbc.beans.EmployeeService;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp09 {

  public static void main(String[] args) {
    String pkgname = MyApp09.class.getPackage().getName();
    System.out.println(pkgname);
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(pkgname);
    EmployeeService employeeService = ctx.getBean("employeeServiceImpl", EmployeeService.class);
    List<Employee> employeeList = employeeService.getAll();
    System.out.println(employeeList);
  }
}
