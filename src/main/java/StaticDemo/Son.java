package StaticDemo;
/**
 * 子类（具体类）
 */
public class Son extends Father {

    static {
        System.out.println("子类静态代码执行了");
    }

    {
        System.out.println("子类非静态代码执行了");
    }

    public Son() {
        System.out.println("子类构造函数代码执行了");
    }
}

