package ru.sayfulin.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.sayfulin.springcourse.dao.FlightDao;

@Controller
@RequestMapping("/flights")
public class FlightController {

	private final FlightDao flightdao;

	@Autowired
	public FlightController(FlightDao flightdao) {
		this.flightdao = flightdao;
	}

	// Get all flights from database and show them on html page
	@GetMapping
	public String index(Model model) {
		model.addAttribute("flights", flightdao.index());
		return "flights/index";
	}

}
