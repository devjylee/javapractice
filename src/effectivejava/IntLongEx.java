package effectivejava;

public class IntLongEx {

	public static void main(String[] args) {
		int itemsBought = 0;
		int funds = 100;
		for (int price = 10; funds >= price; price += 10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Cash left over: "+funds+" cents");
		// 4 items bought.
		// Cash left over: 0 cents

	}

}
