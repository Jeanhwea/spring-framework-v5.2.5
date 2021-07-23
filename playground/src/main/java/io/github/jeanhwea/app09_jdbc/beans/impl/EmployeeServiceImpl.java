package io.github.jeanhwea.app09_jdbc.beans.impl;

import io.github.jeanhwea.app09_jdbc.beans.Employee;
import io.github.jeanhwea.app09_jdbc.beans.EmployeeRowMapper;
import io.github.jeanhwea.app09_jdbc.beans.EmployeeService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }


  @Override
  @SuppressWarnings("unchecked")
  public List<Employee> getAll() {
    List<Employee> employees = jdbcTemplate.query("select * from TB_BASE_EMPL", new EmployeeRowMapper());
    return employees;
  }
}
