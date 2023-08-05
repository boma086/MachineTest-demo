package Others;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 5 1 0 2 1 3 2 4 6 5 8
		 */
		int nextInt = Integer.parseInt(scanner.nextLine());
		List<String> arrayList = new ArrayList<String>(nextInt);
		Long first, last, max = 0l;
		for (int i = 0; i < nextInt; i++) {
			String[] split = scanner.nextLine().split(" ");
			first = Long.parseLong(split[0]);
			last = Long.parseLong(split[1]);
			if (first > max)
				max = first;
			arrayList.add(first + "," + last);
		}
		scanner.close();
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		for (int i = 0; i < max; i++) {
			hashMap.put(i, getStr(i));
		}
		for (String s : arrayList) {
			String[] split = s.split(",");
			char charAt = hashMap.get(Integer.parseInt(split[0]) - 1).charAt(Integer.parseInt(split[1]));
			if (charAt == 'B') {
				System.out.println("blue");
			} else {
				System.out.println("red");
			}

		}
	}

	private static String getStr(int i) {
		if (i == 0) {
			return "R";
		} else {
			return swap(getStr(i - 1));
		}
	}
	private static String swap(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt == 'R') {
				stringBuilder.append("B");
			} else {
				stringBuilder.append("R");
			}
		}
		stringBuilder.append(str);
		return stringBuilder.toString();
	}
	

}
