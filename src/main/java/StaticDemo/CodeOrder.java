package StaticDemo;
public class CodeOrder{
	//静态代码块
	static {
		System.out.println("a");
	}
	public static void main(String[] args){
		System.out.println("y");
		new CodeOrder();
		System.out.println("z");
	}
	//构造方法
	public CodeOrder(){
		System.out.println("b");
	}
	//实例代码块
	{
		System.out.println("c");
	}
	//静态代码块
	static {
		System.out.println("x");
	}
}

