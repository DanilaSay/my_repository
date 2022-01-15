package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImp implements Filter {

	public List<Flight> todayFilter(List<Flight> flights) {

		LocalDateTime today = LocalDateTime.now();

		flights.stream()
				.filter(f -> f.getSegments()
						.equals((f.getSegments().stream().filter(se -> se.getDepartureDate().isBefore(today))
								.collect(Collectors.toList()))))
				.collect(Collectors.toList()).forEach(System.out::println);

		return flights;

	}

	@Override
	public List<Flight> dateFilter(List<Flight> flights) {

		flights.stream().filter(f -> f.getSegments().equals((f.getSegments().stream()
				.filter(se -> se.getArrivalDate().isBefore(se.getDepartureDate())).collect(Collectors.toList()))))
				.collect(Collectors.toList()).forEach(System.out::println);

		return flights;
	}

	@Override
	public List<Flight> earthTimeFilter(List<Flight> flights) {
		List<Flight> fly = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < flights.size(); i++) { // iterating elements type Flight
			for (int j = 0; j < flights.get(i).getSegments().size() - 1; j++) { // iterating elements type Segments
				if (flights.get(i).getSegments().size() > 1) { // check the numbers of segments, to have time oh Ears, i
																// need more than one segments
					sum += flights.get(i).getSegments().get(j + 1).getDepartureDate().getHour()
							- flights.get(i).getSegments().get(j).getArrivalDate().getHour(); // sum all time on Earth
					if (sum > 2) {
						fly.add(flights.get(i));
					}

				}

			}
			sum = 0;
		}

		System.out.println(fly);
		return fly;
	}

}
