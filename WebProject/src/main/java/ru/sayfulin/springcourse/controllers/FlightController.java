package ru.sayfulin.springcourse.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.sayfulin.springcourse.buisneslogic.StatisticInfAirCarriers;
import ru.sayfulin.springcourse.dao.FlightDao;
import ru.sayfulin.springcourse.exceptions.FlightListFormatException;

@Controller
@RequestMapping("/api")
public class FlightController {

	private final FlightDao flightdao;
	private final StatisticInfAirCarriers statisticInfAirCarriers;
	private static Logger Log = Logger.getLogger(FlightController.class.getName());

	@Autowired
	public FlightController(FlightDao flightdao, StatisticInfAirCarriers statisticInfAirCarriers) {
		this.flightdao = flightdao;
		this.statisticInfAirCarriers = statisticInfAirCarriers;
	}

	// Get all flights from database and show them on html page
	@GetMapping("flights")
	public String index(Model model) {
		try {
			model.addAttribute("flights", flightdao.index());
		} catch (FlightListFormatException e) {
			Log.warning("Set is empty");
			e.printStackTrace();
		}
		return "flights/index";
	}

	@GetMapping("delay")
	public String CompDelay(Model model) throws FlightListFormatException {
		model.addAttribute("delay", statisticInfAirCarriers.BigDelays());
		return "flights/delay";
	}
	
}
