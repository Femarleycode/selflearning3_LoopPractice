package loopy;

public class While_Loop {

	public static void main(String[] args) {

		int catCount = 0;
		boolean notEnoughCats = true;

		while (notEnoughCats) {
			System.out.println("Another Cat");
			catCount++;

			if (catCount > 4)
				notEnoughCats = false;
		}
		System.out.println("Too many cats, what shall I ever I do");

		// SEPERATION

		int counter = 0;
		boolean stock_needed = true;

		while (stock_needed) {
			System.out.println("2 * Earplugs");
			counter++;
			if (counter > 4) {
				stock_needed = false;
			}
		}
		System.out.println("Enough earplugs");

		// SEPERATION

		int counter2 = 0;
		boolean screws_needed = true;

		while (screws_needed) {
			System.out.println("Here, take screw");
			counter2++;
			if (counter2 >= 5) {
				screws_needed = false;
			}
		}
		System.out.println("Done with those screws, boss");
	}
}
