import java.util.Scanner;

public class scannext {
    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);

    	System.out.println("What is number?");
    	//nextline,中断读取
    	//nextint,不中断读取
    	int num1 = Integer.parseInt(scan.nextLine());

    	System.out.println(num1);

    	System.out.println("What is string?");
    	String str = scan.nextLine();

    	System.out.println(str);
    	System.out.println("end");
    }
}