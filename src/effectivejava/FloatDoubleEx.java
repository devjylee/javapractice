package effectivejava;

public class FloatDoubleEx {

	public static void main(String[] args) {
		double funds = 1.00;
		int itemsBought = 0;
		for (double price = 0.10; funds >= price; price += 0.10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Change: $"+funds);
		// 3 items bought.
		// Change: $0.3999999999999999

	}

}
