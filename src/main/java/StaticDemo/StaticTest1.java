package StaticDemo;
public class StaticTest1 {
    public static StaticTest1 t1 = new StaticTest1();
    public static StaticTest1 t2 = new StaticTest1();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        StaticTest1 t = new StaticTest1();
    }
}