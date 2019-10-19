package book_transport_apps;

public class BookCar extends Booking {
	
public BookCar() {
	
}

public BookCar(double duration) {
	setDuration(duration);
}


public double getPrice() {
	
	 if(duration < 24)
	    {
	    	double cost = 6;
	    	price = duration * cost;
	    }
	    else
	    {
	    	double cost = 100;
	    	price = duration * cost;
	    }
	return price;
}

}
