//OOP Project Section 2 18/19
//Nurul Atiqah Binti Mustafa Kamal        	1718830
//Nurul Amira Binti Abdul Halim             1719162
//Azma Melia Binti Jafri                    1716694

package book_transport_apps;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BookVehicleTest {

public static void main(String[] args) {
	
	List<Car>carList = new ArrayList<Car>();
	List<Motorcycle>motorList = new ArrayList<Motorcycle>();
	DecimalFormat nf = new DecimalFormat("#.##"); //set the price into 2 decimal
	
	//adding the brand of car in the list
		carList.add(new Car("Perodua","Axia","WG6842B"));
		carList.add(new Car("Toyota", "Altis", "WC2456X"));
		carList.add(new Car("Nissan", "Latio", "WB7412B"));
		carList.add(new Car("Honda", "Jazz", "W4875N"));
		carList.add(new Car("Toyota", "Vios", "W73269C"));
			
	//adding the brand of motorcycle in the list
		motorList.add(new Motorcycle("Yamaha","Y15ZR","V8234K"));
		motorList.add(new Motorcycle("Honda","Dash 125","VB8234L"));
		motorList.add(new Motorcycle("Sym_Bonus","110 SR","V3468E"));
		motorList.add(new Motorcycle("Sym_E_Bonus","110","V5169J"));
		motorList.add(new Motorcycle("Modenas","118 EFi","V7548L"));

	Scanner input = new Scanner(System.in);
	char vehicle = 0;
	
	System.out.println("*******************************WELCOME TO HiHo BOOK CAR APPLICATION***********************************");
	System.out.println();
	System.out.print("Number of customer: ");
	int cust = input.nextInt();
	User[] user = new User[cust]; //put the iser input into array
	System.out.println();
	
	ListOfVehicle(); //display the vehicle lists
	
	for (int i=0; i<user.length; i++) {
		do {
			System.out.print("C for car & M for motorcycle : ");
			vehicle = input.next().charAt(0);//user insert whether c or m
				
			if(vehicle == 'C' || vehicle == 'c') {
				
				System.out.print("Enter car model to book: ");
				String modelC = input.next();// insert car model ##FIRST LETTER MUST BE IN CAPITAL LETTER
				
				for (Car c : carList) {
						//if modelC = model car in arrayList
					if (modelC.equals(c.getModel())) {
						
						System.out.println("Car Model " +modelC+ " is available");
						System.out.println();
						
						System.out.print("Booked duration(hour): ");
						double duration = input.nextDouble();//how long the customer want to booked
						System.out.println();
						Booking car = new BookCar(duration);//set the user input into class BookCar
						System.out.println("Car: "+c.getMade()+"| Model: "+c.getModel()+"| Register Number: "+c.getRegNumber());
						System.out.println("Cost: RM"+ nf.format(car.getPrice()));
						
						
				}
				}
					
			}
			
			else if(vehicle == 'M' || vehicle == 'm') {
				
				System.out.print("Amount of helmet: ");
				int helmet = input.nextInt();
				Motorcycle helmetMotor = new Motorcycle();
				helmetMotor.setAmountOfHelmet(helmet);//set the user input into class Motorcycle
				System.out.println(helmetMotor.getAmountOfHelmet() + " helmet");
				
				System.out.print("Enter motorcycle made to book: ");
				String modelM = input.next();
				
				//if modelM = made Motorcycle in arrayList
				for (Motorcycle m : motorList) {
					if(modelM.equals(m.getMade())) {
						System.out.println("Motorcycle Made " +modelM+ " is available");
						System.out.println();
						
						System.out.print("Booked duration(hour): ");
						double duration = input.nextDouble();
						System.out.println();
						Booking motor = new BookMotorcycle(duration);//set the user input into class BookMotorcycle
						System.out.println("Motorcycle: "+m.getMade()+"| Model: "+m.getModel()+"| Register Number: "+m.getRegNumber());
						System.out.println("Cost: RM"+ nf.format(motor.getPrice()));
						
					}
				}
				
			}
			else
				System.out.println("INVALID INPUT");
				System.out.println();
				
		}while(vehicle != 'C' && vehicle != 'c' && vehicle != 'M' && vehicle != 'm');
		
		//User details
		System.out.print("Name : ");
		String name = input.next();
		System.out.print("Phone Number: ");
		int num = input.nextInt();
		System.out.print("Email: ");
		String email = input.next();
		System.out.print("Create id: ");
		int id = input.nextInt();
		user[i] = new User(name,num,email,id);
		System.out.println();
		System.out.println(user[i].toString());//print the user details
		System.out.println();
}	
	System.out.println("CONTACT US IF YOU NEED OUR SERVICE! Phone number:+603-42330011 || Email: HiHo_Apps@gmail.com");
	System.out.println("THANK YOU & DRIVE SAFELY");
	
	
	input.close();
}

public static void ListOfVehicle() {
	
	String[] CarList = {"Axia","Vios","Jazz","Altis","Latio"} ;
	System.out.println("Car Model :-");
	for(int i=0; i<CarList.length;i++) {
		System.out.println((i+1)+")"+ CarList[i]);
	}
	System.out.println();
	
	String[] MotorList = {"Yamaha","Honda","Modenas","Sym_Bonus","Sym_E_Bonus"} ;
	System.out.println("Motorcycle Made :-");
	for(int i=0; i<MotorList.length;i++) {
		System.out.println((i+1)+")"+ MotorList[i]);
	}
	System.out.println();
	
}
	
}
