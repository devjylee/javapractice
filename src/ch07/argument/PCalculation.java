package ch07.argument;

public class PCalculation {

	public static double getAverage(double... values){
		var result = 0.0;
		for (var value : values) {
			result += value;
		}
		return result/values.length;
	}
	
}