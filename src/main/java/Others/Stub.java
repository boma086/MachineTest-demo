package Others;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Stub
{
   int id(); // A semicolon terminates an element declaration.
   String dueDate();
   String developer() default "unassigned";
}