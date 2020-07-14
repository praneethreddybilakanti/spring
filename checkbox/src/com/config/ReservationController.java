package com.config;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.config.Reservation;
@RequestMapping("/reservation")
@Controller
public class ReservationController {
@RequestMapping("/bookingForm")
	public String bookingForm(Model m)
	{
	Reservation res=new Reservation();
	m.addAttribute("res",res);
		return "reservation-page";
	}
@RequestMapping("/submit")
	public String submitForm(@ModelAttribute("res") Reservation res)  
	{  
	    return "confirmation-form";  
	}  
}
