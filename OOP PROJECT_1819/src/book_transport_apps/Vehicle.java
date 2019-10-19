package book_transport_apps;
public class Vehicle {
	
	protected String made;
	protected String model;
	protected String regNumber;
	
public Vehicle() {
	
}

public Vehicle(String made, String model, String regNum) {
	this.made = made;
	this.model = model;
	this.regNumber = regNum;
}

public String getMade() {
	return made;
}

public String getModel() {
	return model;
}

public String getRegNumber() {
	return regNumber;
}

public void setMade(String made) {
	this.made = made;
}

public void setModel(String model) {
	this.model = model;
}

public void setRegNumber(String regNum) {
	this.regNumber = regNum;
}

public String toString() {
	return "Vehicle MADE: " + made + ", MODEL: " + model + ", REGISTER NUMBER: " + regNumber;
}

}



	


