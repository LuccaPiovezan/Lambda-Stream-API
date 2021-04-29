package lambda.strem.api;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		int mult = 2;
		
		IntStream.range(1, 21)
			.map(i -> i * mult)
			.forEach(System.out::println);
		)
	}
}
