import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main0003 {
	public static void main(String[] args) {

		Map<Integer, Integer> m = new HashMap<>();
		Set<String> set = new HashSet<>();
		m.put(0, 1);
		m.put(1, 2);
		m.put(2, 4);
		m.put(3, 7);
		int[] count = new int[1];
		IntStream.iterate(0, t -> ++t).limit(175).forEach(o -> {
			if (o < 4) {
				m.get(o);
			} else {
				Integer iii = (m.get(o - 1) + m.get(o - 2) + m.get(o - 3) + m.get(o - 4)) % 26;
				m.put(o, iii);
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(m.get(o - 1));
				stringBuilder.append(m.get(o - 2));
				stringBuilder.append(m.get(o - 3));
				stringBuilder.append(m.get(o - 4));
				String string = stringBuilder.toString();
				if (!set.add(string)) {
					System.out.print("again"+o);
				}
			}
		});
		System.out.println("");
		System.out.println(m);
		System.out.println(m.size());
		List<Integer> collect = m.values().stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect.size());
	}
}