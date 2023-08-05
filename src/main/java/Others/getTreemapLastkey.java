package Others;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class getTreemapLastkey {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// b eredderd bw bww bwwl bwwlm bwwln
		String[] split = scanner.nextLine().split(" ");
		scanner.close();
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		List<String> collect = Arrays.asList(split).stream().sorted().collect(Collectors.toList());
		for (int i = 0; i < collect.size(); i++) {
			String str = collect.get(i);
			if (collect.get(i).length() == 1) {
				treeMap.put(str, 1);
			} else {
				if (treeMap.get(str.substring(0, (str.length() - 1)))!=null) {
					treeMap.put(collect.get(i), 1);
				}
			}
		}
		System.out.println(treeMap.lastKey());
		System.out.println(treeMap.toString());
	}

}
