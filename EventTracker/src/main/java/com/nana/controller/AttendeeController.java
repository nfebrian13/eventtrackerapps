package com.nana.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nana.model.Attendee;

@Controller
public class AttendeeController {

	@RequestMapping(value = "/attendee", method = RequestMethod.GET)
	public String displayAttendee(Model model) {
		Attendee attendee = new Attendee();
		model.addAttribute("attendee", attendee);
		return "attendee";
	}

/* @RequestMapping(value = "/attendee", method = RequestMethod.POST)
	public String processAttendee(@ModelAttribute("attendee") Attendee attendee) {
		System.out.println(attendee);
		return "redirect:index.html";
	} */
	
	@RequestMapping(value = "/attendee", method = RequestMethod.POST)
	public String processAttendee(@Valid Attendee attendee, BindingResult result, Model m) {
		System.out.println(attendee);
		
		if (result.hasErrors()) {
			return "attendee";
		}
		
		return "redirect:index.html";
	}

}
