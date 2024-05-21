package standardjava;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_1 {
	
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>();
		List<Tv> tvList3 = new ArrayList<Tv>();
		
		productList.add(new Tv()); // public boolean add(Product e) {}
		productList.add(new Audio());
		
		printALL(productList);
//		printALL(tvList);
		
	}

	private static void printALL(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
