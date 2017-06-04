package model;

import java.util.Date;

public class Visit {

	private Date visit;
	private String status;
	private String lifeRisk;
	private Date nextVisit;
	private String registration;

	public Date getVisit() {
		return visit;
	}

	public void setVisit(Date visit) {
		this.visit = visit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLifeRisk() {
		return lifeRisk;
	}

	public void setLifeRisk(String lifeRisk) {
		this.lifeRisk = lifeRisk;
	}

	public Date getNextVisit() {
		return nextVisit;
	}

	public void setNextVisit(Date nextVisit) {
		this.nextVisit = nextVisit;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

}