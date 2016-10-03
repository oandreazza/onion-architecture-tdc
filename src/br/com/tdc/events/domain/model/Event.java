package br.com.tdc.events.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

	private String name;
	
	private Date date;
	
	private int maxCapacity;
	
	private List<Participant> particpants = new ArrayList<Participant>();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public boolean isSoldout(){
		return particpants.size() == maxCapacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	public void addParticipant(Participant participant){
		this.particpants.add(participant);
	}


}
