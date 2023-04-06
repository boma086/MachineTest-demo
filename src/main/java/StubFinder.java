import java.lang.reflect.Method;
public class StubFinder
{
   public static void main(String[] args) throws Exception
   {
      if (args.length != 1)
      {
         System.err.println("usage: java StubFinder classfile");
         return;
      }
      Class<?> clazz = Class.forName(args[0]);
      if (clazz.isAnnotationPresent(Stub.class))
      {
         Stub stub = clazz.getAnnotation(Stub.class);
         System.out.println("Stub ID = " + stub.id());
         System.out.println("Stub Date = " + stub.dueDate());
         System.out.println("Stub Developer = " + stub.developer());
         System.out.println();
      }
      Method[] methods = clazz.getMethods();
      for (int i = 0; i < methods.length; i++)
         if (methods[i].isAnnotationPresent(Stub.class))
         {
            Stub stub = methods[i].getAnnotation(Stub.class);
            System.out.println("Stub ID = " + stub.id());
            System.out.println("Stub Date = " + stub.dueDate());
            System.out.println("Stub Developer = " + stub.developer());
            System.out.println();
         }
   }
}