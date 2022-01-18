package ru.sayfulin.springcourse.buisneslogic;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import ru.sayfulin.springcourse.controllers.FlightController;
import ru.sayfulin.springcourse.dao.FlightDao;
import ru.sayfulin.springcourse.exceptions.FlightListFormatException;
import ru.sayfulin.springcourse.model.Flight;

public class StatisticInfAirCarriers {

	private final FlightDao flightdao;
	private final Set<Flight> cancelled;
	private final Set<Flight> arrived;
	private static Logger Log = Logger.getLogger(FlightController.class.getName());

	@Autowired
	public StatisticInfAirCarriers(FlightDao flightdao) {
		this.flightdao = flightdao;
		try {
			this.cancelled = filterCancelled(flightdao.index());
			this.arrived = filterArrived(flightdao.index());
			Set<Flight> flights = (Set<Flight>) flightdao.index();
		} catch (FlightListFormatException e) {
			Log.info("Set is empty");
			e.printStackTrace();
		}
	}

	/**
	 * Задача: Сколько рейсов компании American Airlines (UniqueCarrier ‘AA’)
	 * оказались задержаны на 60 минут и более? Если задержался и вылет и прибытие,
	 * учитывается сумма этих задержек. Ответом должно быть целое число.
	 *
	 * @param flights
	 * @return Ответ
	 */

	public String BigDelays() {
		return this.arrived.stream().filter(f -> f.getUniqueCarrier().equals("AA") // Выбор рейсов авиакомпании AA
				&& (f.getDepDelay() >= 60 || f.getArrDelay() >= 60)) // Выбор рейсов с задержкой вылета или прибытия на
																		// 60 и более минут
				.collect(Collectors.counting()).toString(); // Подсчет и возврат количества рейсов авиакомпании AA,
															// задержанных на 60 минут и более

	}

	private Map<String, Long> countDepartures(Set<Flight> flights) {
		return flights.stream().collect(Collectors.groupingBy(Flight::getOriginAirportID, // Группировка по ID аэропорта
				Collectors.counting()));// Подсчет количества рейсов отправленных каждым аэропортом
	}

	/**
	 * Фильтрация отмененных рейсов, исключая перенаправленные
	 *
	 * @param flights
	 * @return сет с отправленными рейсами
	 */
	private Set<Flight> filterCancelled(Set<Flight> flights) {
		// return flights.stream().filter(f -> (f.getCancellationCode() != '\u0000' ||
		// f.isCancelled()) && !f.isDiverted()).collect(Collectors.toSet());
		return flights.stream().filter(f -> (f.getCancellationCode() != '\u0000' && f.isCancelled()) && !f.isDiverted())
				.collect(Collectors.toSet());
	}

	/**
	 * Фильтрация прибывших рейсов, исключая перенаправленные
	 *
	 * @param flights
	 * @return Сет с прибывшими рейсами
	 */
	private Set<Flight> filterArrived(Set<Flight> flights) {
		return flights.stream()
				.filter(f -> (f.getCancellationCode() == '\u0000' || !f.isCancelled()) && !f.isDiverted())
				.collect(Collectors.toSet());
	}

}
