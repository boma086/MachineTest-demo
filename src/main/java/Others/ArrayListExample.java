package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Spliterator;
 
public class ArrayListExample 
{
  public static void main(String[] args) 
  {
    ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
 
    Spliterator<Integer> sItr = digits.spliterator();
     
    sItr.tryAdvance( d -> System.out.println( d ) );
    sItr.tryAdvance( d -> System.out.println( d ) );
    sItr.tryAdvance( d -> System.out.println( d ) );
    sItr.forEachRemaining( d -> System.out.print( d ) ); //3,4,5,6
    
    ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "C", "D"));
    alphabets.removeAll(Collections.singleton("C")); 
    System.out.println(alphabets);
  }
}