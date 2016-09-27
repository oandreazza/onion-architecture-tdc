package br.com.tdc.events.application.infrastructure.dao;

import java.util.List;

import br.com.tdc.events.domain.model.Event;
import br.com.tdc.events.domain.repository.EventRepository;

public class EventDao extends Dao<Event> implements EventRepository  {

	@Override
	public Event save(Event event) {
		return (Event) getSession().persist(event);
	}

	@Override
	public List<Event> list() {
		return getSession().listAll();
	}

	@Override
	public Event findById(Long id) {
		return null;
	}

}
