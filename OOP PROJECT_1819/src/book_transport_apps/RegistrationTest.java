package book_transport_apps;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class RegistrationTest {
	public static void main(String[] args) {
		
		List<Car>carList = new ArrayList<Car>();
		
		//adding the brand of car in the list
		carList.add(new Car("Perodua","Axia","WG6842B"));
		carList.add(new Car("Toyota", "Altis", "WC2456X"));
		carList.add(new Car("Nissan", "Latio", "WB7412B"));
		carList.add(new Car("Honda", "Jazz", "W4875N"));
		carList.add(new Car("Toyota", "Vios", "W73269C"));
		
		List<Motorcycle>motorList = new ArrayList<Motorcycle>();
		
		//adding the brand of motorcycle in the list
		motorList.add(new Motorcycle("Yamaha","Y15ZR","V8234K"));
		motorList.add(new Motorcycle("Honda","Dash 125","VB8234L"));
		motorList.add(new Motorcycle("Sym Bonus","110 SR","V3468E"));
		motorList.add(new Motorcycle("Sym E Bonus","110","V5169J"));
		motorList.add(new Motorcycle("Modenas","118 EFi","V7548L"));
		
		Scanner input = new Scanner(System.in);
		DecimalFormat nf = new DecimalFormat("#.##");
		
		char vehicle;
		System.out.print("Number of customer: ");
		int cust = input.nextInt();
		User[] user = new User[cust];
		System.out.println();
		System.out.println("CHOOSE VEHICLE TO BOOKED");
		
		
		while(user.length>=0){
		do {
		System.out.print("C for car & M for motorcycle : ");
		vehicle = input.next().charAt(0);
		
		if(vehicle == 'C' || vehicle == 'c') {
			
			System.out.print("Enter car model to book: ");
			String modelC = input.next();
		
			for ( Car c : carList) {	
			if (modelC.equals(c.getModel())) {
				
				System.out.println("Car Model " +modelC+ " is available");
				System.out.println();
				
				
				double total = 0.0;
				
				for (int i=0; i<user.length; i++) {
					System.out.print("Name : ");
					String name = input.next();
					System.out.print("Phone Number: ");
					int num = input.nextInt();
					System.out.print("Email: ");
					String email = input.next();
					System.out.println("Create id: ");
					int id = input.nextInt();
					
					System.out.print("Booked duration(hour): ");
					double duration = input.nextDouble();
					new BookCar(duration);
					
					user[i] = new User(name,num,email,id);
					double[] sum = new double[user.length];
					//sum[i] += BookCar.getPrice();
					total += sum[i];
					System.out.println("Cost: RM" + nf.format(sum[i]));
				}
				System.out.println("Total cost: RM" + nf.format(total));
				
				System.out.println();
				
				Booking call = new Booking ();
				call.print();
				for(int i=0; i<user.length; i++) {
					System.out.println(user[i].toString());
				}
				break;
			}
			}
		
		}
		
		else if(vehicle == 'M' || vehicle == 'm') {
			System.out.print("Enter motorcycle made to book: ");
			String modelM = input.next();
		
			for (Motorcycle m : motorList) {
			if(modelM.equals(m.getMade())) {
				System.out.println("Motorcycle Made " +modelM+ " is available");
				
				double total = 0.0;
				
				for (int i=0; i<user.length; i++) {
					System.out.print("Name : ");
					String name = input.next();
					System.out.print("Phone Number: ");
					int num = input.nextInt();
					System.out.print("Email: ");
					String email = input.next();
					System.out.println("Create id: ");
					int id = input.nextInt();
					System.out.println("Amount of helmet: ");
					int helmet = input.nextInt();
					
					System.out.print("Booked duration(hour): ");
					double duration = input.nextDouble();
					new BookMotorcycle(duration);
					
					Motorcycle helmetMotor = new Motorcycle();
					helmetMotor.setAmountOfHelmet(helmet);
					System.out.println(helmetMotor.getAmountOfHelmet() + " helmet");
					
					user[i] = new User(name,num,email,id);
					double[] sum = new double[user.length];
					//sum[i] += BookMotorcycle.getPrice();
					total += sum[i];
					System.out.println("Cost: RM" + nf.format(sum[i]));
				}
				
				System.out.println("Total cost: RM" + nf.format(total));
				System.out.println();
				
				
				
				Booking call = new Booking ();
				call.print();
				
				for(int i=0; i<user.length; i++) {
					System.out.println(user[i].toString());
				}
				break;
				
			}
			
		}
		}
		
		else
			System.out.println("INVALID INPUT");
			System.out.println();
		
		}while(vehicle != 'C' && vehicle != 'c' && vehicle != 'M' && vehicle != 'm' );
		}
		
		
		input.close();
	}

}
