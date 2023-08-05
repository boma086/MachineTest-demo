package Others;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo21 {

    public static void main(String[] args) {
    	// initial conditions
    	int nonVolatileField = 0;
    	CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();/* a single String */
    	// Thread 1
    	nonVolatileField = 1;                 // (1)
    	
//    	list.set(0, "x");                     // (2)
    	list.add(0, "x");
    	// Thread 2
    	String s = list.get(0);               // (3)
    	if (s == "x") {
    	    int localVar = nonVolatileField;  // (4)
    	    System.out.println(localVar);
    	}
    	System.out.println(nonVolatileField);
    	System.out.println("aaaa " + (null == null));
    }
}
