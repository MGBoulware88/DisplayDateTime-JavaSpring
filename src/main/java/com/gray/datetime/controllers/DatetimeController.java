package com.gray.datetime.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatetimeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String showTodaysDate(Model model) {
		Date datetime = new Date();
		SimpleDateFormat dateFormater = new SimpleDateFormat("EEEE, MMM dd, yyyy");
		String dateToShow = dateFormater.format(datetime);
		model.addAttribute("date", dateToShow);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String showCurrentTime(Model model) {
		Date datetime = new Date();
		SimpleDateFormat dateFormater = new SimpleDateFormat("h:mm a");
		String timeToShow = dateFormater.format(datetime);
		model.addAttribute("time", timeToShow);
		return "time.jsp";
	}
}
