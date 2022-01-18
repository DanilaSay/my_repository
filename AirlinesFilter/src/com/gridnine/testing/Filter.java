package com.gridnine.testing;

import java.util.List;

public interface Filter {

	List<Flight> beforeTodayFilter(List<Flight> flights);

	List<Flight> arrBeforeDepdateFilter(List<Flight> flights);

}
