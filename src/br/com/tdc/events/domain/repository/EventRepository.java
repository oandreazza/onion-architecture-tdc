package br.com.tdc.events.domain.repository;

import java.util.List;

import br.com.tdc.events.domain.model.Event;

public interface EventRepository extends GenericRepository<Event>  {

	public List<Event> listAvailable();
	
	
}
