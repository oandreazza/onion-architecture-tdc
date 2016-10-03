package br.com.tdc.events.application.infrastructure.dao;

import java.util.List;

import br.com.tdc.events.domain.model.Event;
import br.com.tdc.events.domain.repository.EventRepository;

public class EventDao extends Dao<Event> implements EventRepository  {

	@Override
	public List<Event> listAvailable() {
		return null;
	}


}
