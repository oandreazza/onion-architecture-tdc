package br.com.tdc.events.application.infrastructure.dao;

import java.util.ArrayList;
import java.util.List;


public class Dao<T> {

	
	protected Dao getSession(){
		return this;
	}
	
	protected T persist(T entity) {
		return entity;
	}

	protected List<T> listAll() {
		return new ArrayList<T>();
	}
	
	
}
