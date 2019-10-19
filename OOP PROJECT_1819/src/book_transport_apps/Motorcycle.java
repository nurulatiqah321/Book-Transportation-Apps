package book_transport_apps;

public class Motorcycle extends Vehicle {
	protected int amountOfHelmet; //desired amount of helmet

public Motorcycle() {
	
}
//variables taken from superclass vehicle
public Motorcycle(String made, String model, String regNum) {
	setMade(made);
	setModel(model);
	setRegNumber(regNum);
}

public int getAmountOfHelmet() {
	return amountOfHelmet;
}

public void setAmountOfHelmet(int helmet) {
	this.amountOfHelmet = helmet;
}

}
