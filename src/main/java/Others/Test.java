package Others;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		String content1 = "My name is {{ name }} and I am forever {{ age }}.";
		String content2 = "My name is {{name}} and I am forever {{age}}.";
		String content3 = "My name is {{name}} and I am forever {{agea}}.";
		Map<String, String> vals = new HashMap<>();
		vals.put("name", "Bill");
		vals.put("age", "21");
		String replace1 = replace(content1, vals);
		if (replace1 == null) {
			System.out.println("未取得");
		} else {
			System.out.println(replace1);
		}
		String replace2 = replace(content2, vals);
		if (replace2 == null) {
			System.out.println("未取得");
		} else {
			System.out.println(replace2);
		}
		String replace3 = replace(content3, vals);
		if (replace3 == null) {
			System.out.println("未取得");
		} else {
			System.out.println(replace3);
		}
	}

	private static String replace(String ori, Map<String, String> values) {
		Pattern p = Pattern.compile("[\\{\\{](\s*?[a-zA-Z]*\s*?)[\\}\\}]");
		Matcher m = p.matcher(ori);
		String replaceAll = ori;
		String str = "";
		String val = "";
		while (m.find()) {
			str = m.group(1).trim();
			val = values.get(str);
			if (val == null) {
				return null;
			} else {
				replaceAll = replaceAll.replaceAll("\\{\\{\s*?" + str + "\s*?\\}\\}", val);
			}
		}
		return replaceAll;

	}
}
