package ru.sayfulin.springcourse.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ru.sayfulin.springcourse.model.Flight;

@Component
public class FlightDaoImp implements FlightDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public FlightDaoImp(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Flight> index() {

		return jdbcTemplate.query("SELECT * FROM flights_small", new BeanPropertyRowMapper<>(Flight.class));
	}

}
