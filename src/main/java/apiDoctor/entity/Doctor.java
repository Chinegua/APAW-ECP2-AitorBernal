package apiDoctor.entity;

import java.util.List;
import java.util.ArrayList;

public class Doctor {

	private int id;
	private String speciality;
	private double cost;
	private List<Appointmen> appoimentList;
	private Level level;

	public Doctor(int id, String speciality) {
		appoimentList = new ArrayList<>();
		this.id = id;
		this.speciality = speciality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		assert id > 0;
		this.id = id;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Appointmen> getApoimentList() {
		return appoimentList;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void addApoiment(Appointmen appointmen) {
		appoimentList.add(appointmen);

	}

}
