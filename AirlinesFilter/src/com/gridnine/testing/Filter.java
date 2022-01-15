package com.gridnine.testing;

import java.util.List;

public interface Filter {

	List<Flight> todayFilter(List<Flight> flights);

	List<Flight> dateFilter(List<Flight> flights);

	List<Flight> earthTimeFilter(List<Flight> flights);
}
