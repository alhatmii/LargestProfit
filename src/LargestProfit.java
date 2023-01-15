import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestProfit {

//	Initializing Scanner:
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Initiate Counter:
		int counter = 1;
		int counter1 = 1;
		int counter2 = 1;
		int counter3 = 1;

//		Adding ArrayLists:
		List<Rice> RiceProfit = new ArrayList<Rice>();
		List<Wheat> WheatProfit = new ArrayList<Wheat>();
		List<Cotton> CottonProfit = new ArrayList<Cotton>();

//		Initializing Menu:
		boolean i = true;
		while (i) {

//			Menu:
			System.out.println("1- Enter Profits for (Rice) for a week.");
			System.out.println("2- Enter Profits for (Wheat) for a week.");
			System.out.println("3- Enter Profits for (Cotton) for a week.");
			System.out.println("4- Print the Input Values.");
//			System.out.println("5- ");
//			System.out.println("6- ");
			System.out.println("7- Exit");

			int choice = sc.nextInt();

			if (choice == 1) {

//				User Input for a Week:
				for (double R = 0; R < 7; R++) {

//					Calling Subjects:
					Rice Rice1 = new Rice();

					System.out.println("Enter the profit of Day " + counter + ":");
					double RiceValue = sc.nextDouble();
					Rice1.setRiceValue(RiceValue);
					RiceProfit.add(Rice1);
					counter++;

				}
			}

			if (choice == 2) {

//				User Input for a Week:
				for (double W = 0; W < 7; W++) {

//					Calling Subjects:
					Wheat Wheat1 = new Wheat();

					System.out.println("Enter the profit of Day " + counter + ":");
					double WheatValue = sc.nextDouble();
					Wheat1.setWheatValue(WheatValue);
					WheatProfit.add(Wheat1);
					counter++;
				}
			}

			if (choice == 3) {
//				User Input for a Week:
				for (double C = 0; C < 7; C++) {

//					Calling Subjects:
					Cotton Cotton1 = new Cotton();

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

					for (Wheat W : WheatProfit) {
						System.out.println("\n");
						System.out.println("The Wheat Income for day " + counter2 + " is " + W.getWheatValue());
						counter2++;

						for (Cotton C : CottonProfit) {
							System.out.println("\n");
							System.out.println("The Cotton Income for day " + counter3 + " is " + C.getCottonValue());
							counter3++;
						}
					}
				}
				// calling max method.
				
			}
//			Exiting the menu:
			else if (choice == 7) {
				i = false;
				System.out.println("\n");
				System.out.println("See you next time!");
			}

//			When Entering larger value:
			else {
				System.out.println("Re-Enter the right value.");
			}
		}
	}
}