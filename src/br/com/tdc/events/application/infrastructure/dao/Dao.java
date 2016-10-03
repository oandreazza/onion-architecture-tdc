package br.com.tdc.events.application.infrastructure.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.tdc.events.domain.repository.GenericRepository;


public abstract class Dao<T> implements GenericRepository<T> {

	
	protected Dao getSession(){
		return this;
	}
	
	protected T persist(T entity) {
		return entity;
	}

	private List<T> listAll() {
		return new ArrayList<T>();
	}
	
	private T find(Long id) {
		return null;
	}
	
	@Override
	public T findById(Long id) {
		return (T) getSession().find(id);
	}

	@Override
	public List<T> list() {
		return listAll();
	}
	
	@Override
	public T save(T entity) {
		return (T) getSession().persist(entity);
	}
	
	
}
