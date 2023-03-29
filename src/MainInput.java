import java.util.Scanner;

public class MainInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		while(true){
			if(scanner.hasNextInt()){
				input = scanner.nextInt();
				break;
			}else{
				System.out.println("请输入数字");
			}		
	}
		for(double balance = 10; balance > 0; balance-=0.1) {
			   System.out.println(balance);
			}
		System.out.println("输入的数字是："+input);
		System.out.println("二进制："+Integer.toBinaryString(input));
		Integer mInteger = 0;
		String t = "11100";
		mInteger+=Integer.parseInt(t,2);
		System.out.println("二进制："+Integer.parseInt(t,2));
		t = "11000";
		mInteger+=Integer.parseInt(t,2);
		System.out.println("二进制："+Integer.parseInt(t,2));
		t = "11000";
		mInteger+=Integer.parseInt(t,2);
		System.out.println("二进制："+Integer.parseInt(t,2));
		t = "10100";
		mInteger+=Integer.parseInt(t,2);
		System.out.println("二进制："+Integer.parseInt(t,2));
		t = "11010";
		mInteger+=Integer.parseInt(t,2);
		System.out.println("二进制："+Integer.parseInt(t,2));
		System.out.println("二进制："+mInteger);
	}
}

