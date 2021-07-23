package io.github.jeanhwea.app09_jdbc;

import io.github.jeanhwea.app07_aop.beans.LogEntry;
import io.github.jeanhwea.app09_jdbc.beans.Employee;
import io.github.jeanhwea.app09_jdbc.beans.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class MyApp09 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(MyApp09.class.getPackage().getName());
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		List<Employee> employeeList = employeeService.getAll();
		System.out.println(employeeList);
	}
}
