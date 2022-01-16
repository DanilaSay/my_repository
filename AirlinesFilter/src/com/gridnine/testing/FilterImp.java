package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImp implements Filter {

	public List<Flight> beforeTodayFilter(List<Flight> flights) {

		LocalDateTime today = LocalDateTime.now();

		return flights.stream()
				.filter(f -> f.getSegments()
						.equals((f.getSegments().stream().filter(se -> se.getDepartureDate().isBefore(today))
								.collect(Collectors.toList()))))
				.collect(Collectors.toList());

	}

	@Override
	public List<Flight> arrBeforeDepdateFilter(List<Flight> flights) {

		List<Flight> fly = new ArrayList<>();

		for (int i = 0; i < flights.size(); i++) { // iterating elements type Flight
			for (int j = 0; j < flights.get(i).getSegments().size(); j++) { // iterating elements type Segments
				if (flights.get(i).getSegments().get(j).getArrivalDate()
						.isBefore(flights.get(i).getSegments().get(j).getDepartureDate())) {
					fly.add(flights.get(i));
				}

			}

		}

		fly.stream().forEach(System.out::println);
		return fly;
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

		fly.stream().forEach(System.out::println);
		return fly;
	}

}
