package book_transport_apps;
import java.util.Random;
import java.util.Date;

public class Booking {
	protected static double price;
	protected int receipt_no;
	protected static double duration;
	private Date dateTaken;
	User user;

public Booking() {
	dateTaken = new Date();
}

public int getReceipt(){
	Random random = new Random();
	receipt_no = random.nextInt(1000);
	return receipt_no;
}

public double getDuration(){
	return duration;
}

public void setDuration(double duration) {
	Booking.duration = duration;
}

public Date getDateTaken() {
	return dateTaken;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	Booking.price = price;
}

public void print(){
	System.out.println("Receipt Number: "+ receipt_no + " , Date purchased: " + dateTaken);
}


}
