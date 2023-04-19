package StaticDemo;
/**
 * 父类（抽象类）
 */
public abstract class Father {

    static {
        System.out.println("父类静态代码执行了");
    }

    {
        System.out.println("父类非静态代码执行了");
    }

    public Father() {
        System.out.println("父类构造函数代码执行了");
    }

    public static void main(String[] args) {
        Son son = new Son();
    }
}

