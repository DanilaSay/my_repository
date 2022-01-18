package ru.sayfulin.springcourse.dao;


import java.util.Set;

import ru.sayfulin.springcourse.exceptions.FlightListFormatException;
import ru.sayfulin.springcourse.model.Flight;

public interface FlightDao {
	
	public Set<Flight> index() throws FlightListFormatException;

}
