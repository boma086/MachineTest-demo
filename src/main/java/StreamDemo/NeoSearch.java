package StreamDemo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NeoSearch {

	public static void main(String[] args) throws StackOverflowError {
		// TODO Auto-generated method stub
		List<String> ls = List.of("Neo", "Morpheus", "Oracle", "Trinity", "Neo");
		Predicate<String> neoSearch = str -> {
			System.out.println("agent smith is looking for neo..."+ str);
			return str.contains("Neo");
		};
		Stream<Integer> binaryNumbers = List.of(1, 0, 1, 1, 1, 1, 1, 1).stream();
		Integer binarySum = binaryNumbers.reduce(Integer::sum).orElseThrow(StackOverflowError::new);
		boolean neoFound = ls.stream().filter(str -> str.length() >= binarySum).anyMatch(neoSearch);
		System.out.println(neoFound);
	}
}
