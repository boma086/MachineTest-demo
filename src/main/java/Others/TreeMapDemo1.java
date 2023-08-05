package Others;
import java.util.*;    
public class TreeMapDemo1  
{    
public static void main(String args[])  
{    
//object of TreeMap class  
    TreeMap<String,String> treemap=new TreeMap<String,String>();      
//we can take anything in the key such as integer, string, etc.  
//adding elements to the TreeMap  
    System.out.println("Original TreeMap");
    treemap.put("B","Delhi");
    treemap.put("H","Ahmedabad ");      
    treemap.put("D","Jaipur");      
      
//    treemap.put("F","Agra");   
//    treemap.put("P","Patna");  
 
//Printing values  
    System.out.println(treemap);
   
// Inserting the element at specified corresponding to specified key
//    treemap.put("F", "Goa");
//    treemap.replace("P", "Patna", "1");
    
	// for-each loop for fetching the elements from the TreeMap
	for (Map.Entry m : treemap.entrySet()) {
		//prints the key and value pair of the elements   
		System.out.println(m.getKey() + " " + m.getValue());
	}
   
    // Printing the updated elements of Map
    System.out.println();
    System.out.println("Updated TreeMap");
    System.out.println(treemap);  
    System.out.println(treemap.higherKey("B"));
    }    
}  