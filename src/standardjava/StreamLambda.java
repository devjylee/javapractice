package standardjava;

import java.util.stream.Stream;

public class StreamLambda {

	public static void main(String[] args) {
		// iterate(T seed, UnaryOperator<T> f)
		Stream<Integer> intStream = Stream.iterate(1, n->n+2);
		intStream.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : 주기만 하는 것, 입력X, 출력O
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);
		
	}

}
