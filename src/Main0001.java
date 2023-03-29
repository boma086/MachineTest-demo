import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main0001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 注意 hasNext 和 hasNextLine 的区别
		while (in.hasNextInt()) { // 注意 while 处理多个 case
			int a = in.nextInt();
			String b = in.next();
			String c = in.next();
			System.out.println(a + b + c);
			int[] playerNo = new int[a];
			String[] splitb = b.split(",");
			String[] splitc = c.split(",");
			if(a!=splitb.length) {System.out.println("--");return;}
			if(a!=splitc.length) {System.out.println("--");return;}
			Map<Integer,List<Integer>> score = new HashMap<>();
			for (int i = 0; i < a; i++) {
				List<Integer> list = score.getOrDefault(Integer.parseInt(splitb[i]),new ArrayList<Integer>());
				list.add(Integer.parseInt(splitc[i]));
				score.put(Integer.parseInt(splitb[i]), list);
			}
			List<Integer> collect = score.entrySet().stream()
			.filter(x->x.getValue().size() >=3)
			.sorted((o1,o2)->{
				int sum1 = o1.getValue().stream().sorted().limit(3).mapToInt(i->i.intValue()).sum();
				int sum2 = o2.getValue().stream().sorted().limit(3).mapToInt(i->i.intValue()).sum();
				return sum1-sum2;
			})
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
//			for (int i = 0; i < collect.size(); i++) {
//				collect.get(collect)
//			}
			System.out.println(collect);
			

		}
	}
}