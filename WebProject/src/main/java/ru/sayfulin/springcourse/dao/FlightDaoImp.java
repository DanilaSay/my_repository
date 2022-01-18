package ru.sayfulin.springcourse.dao;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ru.sayfulin.springcourse.exceptions.FlightListFormatException;
import ru.sayfulin.springcourse.model.Flight;

@Component
public class FlightDaoImp implements FlightDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public FlightDaoImp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Set<Flight> index() throws FlightListFormatException {
		Set<Flight> result = new HashSet <Flight> (jdbcTemplate.query("SELECT * FROM flights_small", new BeanPropertyRowMapper<>(Flight.class)));
		if (result.isEmpty()) {
			throw new FlightListFormatException("Список полетов не заполнен");
		}
		
		return result;
	}



}
