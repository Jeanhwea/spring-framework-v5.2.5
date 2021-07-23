package io.github.jeanhwea.app09_jdbc.beans;


public class Employee {
  private Long id;
  private String name;

  public Employee(Long id, String name) {
    this.id = id;
    this.name = name;
  }

	@Override
	public String toString() {
		return "Employee[" + this.id +"]";
	}
}
