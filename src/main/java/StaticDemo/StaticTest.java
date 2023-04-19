package StaticDemo;
public class StaticTest {
    public static StaticTest t1 = new StaticTest();
    public static StaticTest t2 = new StaticTest();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public StaticTest() {
        System.out.println("构造方法代码");
    }

    public static void main(String[] args) {
        StaticTest t = new StaticTest();
    }
}

