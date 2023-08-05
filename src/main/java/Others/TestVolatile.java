package Others;

public class TestVolatile {
    private  static  int increment = 0;
    public static void main(String[] args)
    {
        new ThreadA().start();
        new ThreadB().start();
    }
    static class ThreadB extends Thread {
        @Override
        public void run(){
            while (increment < 10) {
                System.out.println(   "Incrementing , value now is : "+ ++increment );
                try {
                    Thread.sleep(600);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
   static class ThreadA extends Thread {
        @Override
         public void run(){
            int x = increment ;
            while (true ) {
                if (x != increment) {
                    System.out.println("increment variable changed " +  increment);
                    x = increment;
                }
            }
        }
    }
}