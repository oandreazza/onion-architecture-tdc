package br.com.tdc.events.domain.repository;

import java.util.List;

public interface GenericRepository<T> {
	
	public T save(T entity);
	
	public List<T> list();
	
	public T findById(Long id);
}
