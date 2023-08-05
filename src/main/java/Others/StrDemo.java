package Others;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StrDemo {

	public static void main(String[] args) {
//		String hello = "Hello";
//		String lo = "lo";
//		System.out.println(hello == "Hello");
//		System.out.println(Other.hello == "Hello");
//		System.out.println(hello == "Hel"+"lo");
//		System.out.println(hello == "Hel"+lo);
//		System.out.println(hello == ("Hel"+lo).intern());
		
		long startTime = System.currentTimeMillis();
		 
		List<String> strings = IntStream.rangeClosed(1, 10_000_000)
		  .mapToObj(Integer::toString)
		  .collect(Collectors.toList());
		 
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println(
		  "Generated " + strings.size() + " strings in " + totalTime + " ms.");
		 
		startTime = System.currentTimeMillis();
		 
		String appended = (String) strings.stream()
		  .limit(100_000)
		  .reduce("", (l, r) -> l.toString() + "啊" + r.toString());
		 
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Created string of length " + appended.length() 
		  + " in " + totalTime + " ms.");




	}

}

