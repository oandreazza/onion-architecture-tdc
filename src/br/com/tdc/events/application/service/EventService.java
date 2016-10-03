package br.com.tdc.events.application.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tdc.events.domain.model.Event;
import br.com.tdc.events.domain.repository.EventRepository;
import br.com.tdc.events.domain.service.EventServiceInterface;

public class EventService implements EventServiceInterface {

	private EventRepository dao;
	
	public EventService(EventRepository dao) {
		this.dao = dao;
	}
	
	@Override
	public Event create(Event event) {
		return dao.save(event);
	}

	@Override
	public List<Event> getUpComingEvents(Integer numberOfEvents) {
		return dao.list().stream().limit(numberOfEvents).collect(Collectors.toList());
	}

	@Override
	public List<Event> listAvailableEvents() {
		return dao.listAvailable();
	}


}
