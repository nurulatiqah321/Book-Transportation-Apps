package book_transport_apps;

public class BookMotorcycle extends Booking {
	
public BookMotorcycle() {
	
}

public BookMotorcycle(double duration) {
	setDuration(duration);
}


public double getPrice() {
	 if(duration < 24)
	    {
	    	double cost = 3;
	    	price = duration * cost;
	    }
	    else
	    {
	    	double cost = 50;
	    	price = duration * cost;
	    }
	return price;
}

}
