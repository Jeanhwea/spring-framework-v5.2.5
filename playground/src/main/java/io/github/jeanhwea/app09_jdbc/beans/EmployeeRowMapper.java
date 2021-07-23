package io.github.jeanhwea.app09_jdbc.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

@SuppressWarnings("all")
public class EmployeeRowMapper implements RowMapper<Employee> {
  @Override
  public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new Employee(rs.getLong("G_ID"), rs.getString("EMPL_NAME"));
  }
}
