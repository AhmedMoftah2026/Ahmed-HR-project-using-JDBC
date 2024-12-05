package com.Ahmed.hrjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Ahmed.hrjdbc.entity.Employee;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Employee(rs.getLong("id") , rs.getString("name"), rs.getDouble("salary"), rs.getString("is_create"));
	}

}