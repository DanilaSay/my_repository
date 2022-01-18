package com.gridnine.testing;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Flight> flights = FlightBuilder.createFlights();

		Filter filter = new FilterImp();

		/*
		 * Filter flights in which arrival date is before today
		 */

		filter.beforeTodayFilter(flights).forEach(System.out::println);

		System.out.println();

		/*
		 * Filter flights in which arrival date is before departure date
		 */

		filter.arrBeforeDepdateFilter(flights).forEach(System.out::println);

		System.out.println();


	}

}
