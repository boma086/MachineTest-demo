package StaticDemo;
public class StaticTest {
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }
    public static StaticTest t1 = new StaticTest();
    public static StaticTest t2 = new StaticTest();

    public StaticTest() {
        System.out.println("构造方法代码");
    }

    public static void main(String[] args) {
    	System.out.println("main start");
        StaticTest t = new StaticTest();
    }
}

