import java.util.Scanner;
import java.util.TreeMap;

public class C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sep = scanner.nextLine();
		String[] split = scanner.nextLine().split(sep);
		scanner.close();
		TreeMap<String, Integer> treeMap = new TreeMap<String,Integer>();
		for (String string : split) {
			for (int i = 0; i < string.length(); i++) {
				int length = string.replaceAll(string.charAt(i)+"", "").length();
				if(string.length()-length>1) {
					treeMap.put(string,0);
				}
			}
		}
		System.out.println(treeMap.lastKey());
	}
}
