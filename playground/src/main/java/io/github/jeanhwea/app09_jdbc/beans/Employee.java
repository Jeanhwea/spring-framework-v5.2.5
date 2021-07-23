package io.github.jeanhwea.app09_jdbc.beans;

import org.springframework.stereotype.Component;

public class Employee {
	private Long id;
	private String name;

	public Employee(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
