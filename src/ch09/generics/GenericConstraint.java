package ch09.generics;

public class GenericConstraint<T extends Comparable<T>> {
	public int Hoge(T x, T y) {
		return x.compareTo(y);
	}

}
