package org.perscholas.models;

public class Cars {
	
	//fields
	
	private String car;
	private double mpg;
	private double cylinders;
	private double displacement;
	private double housePower;
	private double weight;
	private double acceleration;
	private double model;
	private String origin;
	
	//constructor
	public Cars() {}

	

	
	
	
	
	
	public Cars(String car, double mpg, double cylinders, double displacement, double housePower, double weight,
			double acceleration, double model, String origin) {
		super();
		this.car = car;
		this.mpg = mpg;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.housePower = housePower;
		this.weight = weight;
		this.acceleration = acceleration;
		this.model = model;
		this.origin = origin;
	}








	// methods
	@Override
	public String toString() {
		return "Cars [car=" + car + ", mpg=" + mpg + ", cylinders=" + cylinders + ", displacement=" + displacement
				+ ", housePower=" + housePower + ", weight=" + weight + ", acceleration=" + acceleration + ", model="
				+ model + ", origin=" + origin + "]";
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public double getMpg() {
		return mpg;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	public double getCylinders() {
		return cylinders;
	}

	public void setCylinders(double cylinders) {
		this.cylinders = cylinders;
	}

	public double getDisplacement() {
		return displacement;
	}

	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}

	public double getHousePower() {
		return housePower;
	}

	public void setHousePower(double housePower) {
		this.housePower = housePower;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public double getModel() {
		return model;
	}

	public void setModel(double model) {
		this.model = model;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	
	// getters and setters 

	
	
	
	

}
