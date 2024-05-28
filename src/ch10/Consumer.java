package ch10;

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}
