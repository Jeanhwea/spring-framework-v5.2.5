package io.github.jeanhwea.app09_jdbc.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
	public List<Employee> getAll();
}
