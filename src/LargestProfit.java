import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestProfit {

//	Initializing Scanner:
	static Scanner sc = new Scanner(System.in);

 //	Intiate Counter:
	static int counter = 1;

	public static void main(String[] args) {

//		Adding ArrayLists:
		List<Rice> RiceProfit = new ArrayList<Rice>();
		List<Wheat> WheatProfit = new ArrayList<Wheat>();
		List<Cotton> CottonProfit = new ArrayList<Cotton>();

//		Calling Subjects:
		Rice Rice = new Rice();
		Wheat Wheat = new Wheat();
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

//				User Input for a Week:
				for (double i1 = 0; i1 < 7; i1++) {
					System.out.println("Enter the profit of Day " + counter + ":");
					double RiceValue = sc.nextDouble();
					Rice.setRiceValue(RiceValue);
					RiceProfit.add(Rice);
					counter ++;

				}

			}
			if (choice == 2) {
//				User Input for a Week:
				for (double i1 = 0; i1 < 7; i1++) {
					System.out.println("Enter the profit of Day " + counter + ":");
					double WheatValue = sc.nextDouble();
					Rice.setRiceValue(WheatValue);
					WheatProfit.add(Wheat);
					counter ++;	
			}
			}
		}
	}
}