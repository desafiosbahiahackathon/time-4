package model;

import java.util.List;

public class Woman {

	private String id;
	private String name;
	private String address;
	private String neighborhood;
	private String city;
	private String policeCar;
	private String group;
	private String registration;
	private String phone;
	private int timeLapse;
	private List<Visit> visits;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPoliceCar() {
		return policeCar;
	}

	public void setPoliceCar(String policeCar) {
		this.policeCar = policeCar;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getTimeLapse() {
		return timeLapse;
	}

	public void setTimeLapse(int timeLapse) {
		this.timeLapse = timeLapse;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

}