package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImp implements Filter {

	public List<Flight> beforeTodayFilter(List<Flight> flights) {

		LocalDateTime today = LocalDateTime.now();

		return flights.stream()
				.filter(f -> f.getSegments()
						.equals((f.getSegments().stream().filter(se -> se.getDepartureDate().isAfter(today))
								.collect(Collectors.toList()))))
				.collect(Collectors.toList());

	}

	@Override
	public List<Flight> arrBeforeDepdateFilter(List<Flight> flights) {
		return flights.stream()
				.filter(f -> f.getSegments()
						.equals((f.getSegments().stream().filter(se -> se.getArrivalDate().isAfter(se.getDepartureDate()))
								.collect(Collectors.toList()))))
				.collect(Collectors.toList());
	}


}
