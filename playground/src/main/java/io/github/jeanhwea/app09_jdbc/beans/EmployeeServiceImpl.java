package io.github.jeanhwea.app09_jdbc.beans;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeServiceImpl implements EmployeeService {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public EmployeeServiceImpl(DataSource dataSource) {
    this.setDataSource(dataSource);
  }

  @Override
  @SuppressWarnings("all")
  public List<Employee> getAll() {
    List<Employee> employees =
        jdbcTemplate.query("select * from TB_BASE_EMPL", new EmployeeRowMapper());
    return employees;
  }
}
