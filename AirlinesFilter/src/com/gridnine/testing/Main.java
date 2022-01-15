package com.gridnine.testing;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Flight> flights = FlightBuilder.createFlights();

		Filter filter = new FilterImp();

		/*
		 * Filter flights in which arrival date is before today
		 */

		filter.todayFilter(flights);

		/*
		 * Filter flights in which arrival date is before departure date
		 */

		filter.dateFilter(flights);

		/*
		 * Filter flights in which time on Earth is more than two hours
		 */

		filter.earthTimeFilter(flights);

	}

}
