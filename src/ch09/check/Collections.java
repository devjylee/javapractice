package ch09.check;

import java.util.Collection;

public class Collections {
	
	public static<T> boolean addAll(Collection<? super T> c, T... elements) {
		boolean result = false;
		for (T element : elements)
			result |= c.add((T) elements);
		return result;
	}

}
