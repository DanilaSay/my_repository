package com.gridnine.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FilterImpTest {

	@Test
	void testFirstFilterNotRightData() {

		LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);

		List<Flight> testlist = Arrays.asList(createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2)));

		FilterImp filter = new FilterImp();
		List<Flight> emptylist = new ArrayList<>();

		assertEquals(emptylist, filter.beforeTodayFilter(testlist));
	}

	@Test
	void testSecondFilterOneRightFlight() {

		LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);

		List<Flight> testlist = Arrays.asList(createFlight(threeDaysFromNow, threeDaysFromNow.minusHours(6)));

		Filter filter = new FilterImp();
		
		

		assertEquals(testlist, filter.arrBeforeDepdateFilter(testlist));
	}

	@Test
	void testThirdFilterNoRightData() {

		LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);

		List<Flight> testlist = Arrays.asList(createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2)));

		FilterImp filter = new FilterImp();

		List<Flight> emptylist = new ArrayList<>();

		assertEquals(emptylist, filter.earthTimeFilter(testlist));
	}

	private Flight createFlight(final LocalDateTime... dates) {
		if ((dates.length % 2) != 0) {
			throw new IllegalArgumentException("you must pass an even number of dates");
		}
		List<Segment> segments = new ArrayList<>(dates.length / 2);
		for (int i = 0; i < (dates.length - 1); i += 2) {
			segments.add(new Segment(dates[i], dates[i + 1]));
		}
		return new Flight(segments);
	}
}
