package Others;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

// Creating BenchmarkRunner class
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(java.util.concurrent.TimeUnit.MILLISECONDS)
@Fork(value = 1, warmups = 1)
public class BenchmarkRunner
{
   // For running the Benchmarks
   public static void main(String[] args) throws RunnerException
   {
		Options opt = new OptionsBuilder()
                .include(BenchmarkRunner.class.getSimpleName())
                .forks(1)
                .build();
             new Runner(opt).run();
   }
    // Creating Benchmark for synchronizedMap
    @Benchmark
    public void synchronizedMapReadAndWrite()
   {
    	Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
    	readAndWriteTest(map);
    }
     // Creating Benchmark for ConcurrentHashMap
    @Benchmark
    public void concurrentHashMapReadAndWrite()
   {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        readAndWriteTest(map);
   }
    // Test method for putting and getting random numbers from the map
    private void readAndWriteTest(final Map<String, Integer> map)
   {
        for (int i = 0; i < 1000; i++) {
            Integer randomNumber = (int) Math.ceil(Math.random() * 1000);
            map.get(String.valueOf(randomNumber));
            map.put(String.valueOf(randomNumber), randomNumber);
        }
   }
}