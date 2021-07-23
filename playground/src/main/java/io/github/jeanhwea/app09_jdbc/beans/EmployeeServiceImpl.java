package io.github.jeanhwea.app09_jdbc.beans;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Autowired
  public EmployeeServiceImpl(DataSource dataSource) {
    this.setDataSource(dataSource);
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Employee> getAll() {
    List<Employee> employees =
        this.jdbcTemplate.query("select * from TB_BASE_EMPL", new EmployeeRowMapper());
    return employees;
  }
}
