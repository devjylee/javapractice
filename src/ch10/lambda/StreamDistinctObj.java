package ch10.lambda;

import java.util.HashSet;
import java.util.stream.Stream;

public class StreamDistinctObj {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        Stream.of(
                new Person("야마다", 40),
                new Person("타카노", 30),
                new Person("오오카와", 35),
                new Person("야마다", 45)
        )
        .filter(p -> set.add(p.name))
        .forEach(System.out::println);
    }
}
