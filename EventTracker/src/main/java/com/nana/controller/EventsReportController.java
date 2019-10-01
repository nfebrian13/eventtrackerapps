package com.nana.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nana.model.Event;

@RestController
public class EventsReportController {

	@RequestMapping("/events")
	public List<Event> getEvents(){
		List<Event> events = new ArrayList<>();
		
		Event event1 = new Event();
		event1.setName("Java User Group");
		
		events.add(event1);
		
		Event event2 = new Event();
		event1.setName("Angular user Group");
		
		events.add(event1);
		
		return events;
	}
}
