package br.com.tdc.events.domain.service;

import java.util.List;

import br.com.tdc.events.domain.model.Event;

public interface EventServiceInterface {

	public Event create(Event event);
	
	public List<Event> getUpComingEvents(Integer numberOfEvents);
	
	public List<Event> listAvailableEvents();
	
}
