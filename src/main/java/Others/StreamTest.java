package Others;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = IntStream.iterate(0, i -> i + 2).mapToObj(Integer::valueOf).limit(10).collect(Collectors.toList());
		System.out.println(ints);
		List<Integer> ints1 = IntStream.range(0, 10).mapToObj(Integer::valueOf).limit(10).collect(Collectors.toList());
		System.out.println(ints1);

		List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(randomNumbers);

		List<StreamTestEmployee> employees = Stream.generate(StreamTestEmployee::create).limit(5)
				.collect(Collectors.toList());
		System.out.println(employees);

	}
}
