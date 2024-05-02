package ch05;

public class StrSplit {

	public static void main(String[] args) {
		var str1 = "うめ,もも,さくら";
		var result1 = str1.split(","); // result1 = [うめ, もも, さくら]
		System.out.println(String.join("&", result1)); //うめ&もも&さくら

		var str2 = "うめ,もも,さくらとあんず";
		var result2 = str2.split("[,と]"); // result2 = [うめ, もも, さくら, あんず]
		System.out.println(String.join("&", result2)); //うめ&もも&さくら&あんず

		var str3 = "うめ,もも,さくら";
		var result3 = str3.split(""); // result3 = [う, め, も, も, さ,く, ら]
		System.out.println(String.join("&", result3)); //う&め&も&も&さ&く&ら

		var str4 = "うめ,もも,さくら,あんず";
		var result4 = str4.split(",",3); // result4 = [うめ, もも, さくら,あんず]
		System.out.println(String.join("&", result4)); //うめ&もも&さくら,あんず
	}

}
