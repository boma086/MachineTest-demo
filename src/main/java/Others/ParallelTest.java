package Others;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ParallelTest {
	public static void main(String[] args) {
	    ParallelTest test = new ParallelTest();

	    List<Integer> list = Arrays.asList(1,2);
	    Set<Integer> set = new HashSet<>(list);

	    ForkJoinPool forkJoinPool = new ForkJoinPool(4);

	    System.out.println("set print");
	    try {
	        forkJoinPool.submit(() ->
	            set.parallelStream().forEach(test::print)
	        ).get();
	    } catch (Exception e) {
	        return;
	    }

	    System.out.println("\n\nlist print");
	    try {
	        forkJoinPool.submit(() ->
	            list.parallelStream().forEach(test::print)
	        ).get();
	    } catch (Exception e) {
	        return;
	    }   
	}

	private void print(int i){
	    System.out.println("start: " + i);
	    try {
	        TimeUnit.SECONDS.sleep(1);
	    } catch (InterruptedException e) {
	    }
	    System.out.println("end: " + i);
	}
}
