package br.com.tdc.events.domain.repository;

import java.util.List;

import br.com.tdc.events.domain.model.Event;

public interface EventRepository {

	public Event save(Event event);
	
	public List<Event> list();
	
	public Event findById(Long id);
	
}
