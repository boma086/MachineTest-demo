import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main0002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> mm = new HashMap<>();
		String nextLine = "";
		String nextLine2 = "";
		// 注意 hasNext 和 hasNextLine 的区别
		if (in.hasNextLine()) {
			nextLine = in.nextLine();
			nextLine2 = in.nextLine();
		}
		char[] charArray = nextLine.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("target"+charArray[i]);
			Integer computeIfPresent = mm.computeIfPresent(String.valueOf(toLowerCase(charArray[i])),
					(key, val) -> val + 1);
			System.out.println("computeIfPresent"+computeIfPresent+mm);
			if (computeIfPresent == null) {
				mm.put(String.valueOf(toLowerCase(charArray[i])), 1);
				System.out.println(mm);
			}

		}
            System.out.println(mm);

	}

	public static char toLowerCase(char c1) {
		int a = (int) c1;// 将接收到的小写字符c1转换成int类型的数据给a
		if (a > 96)
			return c1;
		int b = a + 32; // a+32得出大写写对应小写的ascll数值
		char bb = (char) b;// 最后将b转换成char类型字符给bb
		return bb; // 返回bb；就是返回字母小写的字符

	}

}