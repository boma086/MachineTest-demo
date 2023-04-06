import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class IntStreamSample {
	public static void main(String[] args) {
		Map<equalsHashcode, Integer> map = new HashMap<>();
		IntStream.range(0, 1_000).forEach(i -> map.put(new equalsHashcode(), i));
		System.out.println(map.size());
		for (Map.Entry<equalsHashcode, Integer> item: map.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());
		}
		System.out.println(map.size());
	}
}
