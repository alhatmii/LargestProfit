import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestProfit {

//	Initializing Scanner:
	static Scanner sc = new Scanner(System.in);

	// Initiate Counter:
	static int counter = 1;
	static int counter1 = 1;

//	Initiate Object:
	static Rice RiceO = new Rice();
	static Wheat WheatO = new Wheat();
	static Cotton CottonO = new Cotton();

	public static void main(String[] args) {

//		Adding ArrayLists:
		List<Rice> RiceProfit = new ArrayList<Rice>();
		List<Wheat> WheatProfit = new ArrayList<Wheat>();
		List<Cotton> CottonProfit = new ArrayList<Cotton>();

//		Calling Subjects:
		Cotton Cotton = new Cotton();

//		Initializing Menu:
		boolean i = true;
		while (i) {

//			Menu:
			System.out.println("1- Enter Profits for (Rice) for a week.");
			System.out.println("2- Enter Profits for (Wheat) for a week.");
			System.out.println("3- Enter Profits for (Cotton) for a week.");
			System.out.println("4- Open History Updated Inputs.");
			System.out.println("5- Search Word In Exsisting file.");
			System.out.println("6- Encrypting new data from Exsisting file.");
			System.out.println("7- Exit");

			int choice = sc.nextInt();

			if (choice == 1) {

//				Calling Subjects:
				Rice Rice1 = new Rice();
				RiceO = Rice1;

//				User Input for a Week:
				for (double R = 0; R < 7; R++) {
					System.out.println("Enter the profit of Day " + counter + ":");
					double RiceValue = sc.nextDouble();
					Rice1.setRiceValue(RiceValue);
					RiceProfit.add(Rice1);
					counter++;

				}

			}
			if (choice == 2) {

//				Calling Subjects:
				Wheat Wheat1 = new Wheat();
				WheatO = Wheat1;

//				User Input for a Week:
				for (double W = 0; W < 7; W++) {
					System.out.println("Enter the profit of Day " + counter + ":");
					double WheatValue = sc.nextDouble();
					Wheat1.setWheatValue(WheatValue);
					counter++;
				}
				WheatProfit.add(Wheat1);
			}

			if (choice == 3) {
//				User Input for a Week:
				for (double C = 0; C < 7; C++) {

//					Calling Subjects:
					Cotton Cotton1 = new Cotton();
					CottonO = Cotton1;

					System.out.println("Enter the profit of Day " + counter + ":");
					double CottonValue = sc.nextDouble();
					Cotton1.setCottonValue(CottonValue);
					CottonProfit.add(Cotton1);
					counter++;
				}
			}
//			To Print out the data:
			else if (choice == 4) {

				for (Rice R : RiceProfit) {
					System.out.println("\n");
					System.out.println("The Rice Income for day " + counter1 + " is " + R.getRiceValue());
					counter1++;

////				For loop inside for loop:
//				for (Department D : newDept) {
//
//					System.out.println("Assigned in " + D.getName() + " Department");
//
////					print the incremented counter variable value in for-each loop:
//					System.out.println("--------------------------------------------");
//					System.out.println("Teacher Number" + " #" + counter);
//
//
//				}
				}
			}
		}
	}
}