package Others;
import java.io.Serializable;
import java.util.Random;
public class StreamTestEmployee implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Random r = new Random(Integer.MAX_VALUE);
	private long id;
	private String name;
	private double salary;
	public StreamTestEmployee(int nextInt, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	//All-args constructor, getters and setters are hidden for brevity
	public static StreamTestEmployee create() {
		//Get the employee id in more predictable manner
		//e.g. Max id present in databse + 1
		StreamTestEmployee obj = new StreamTestEmployee(r.nextInt(), "", 0.0d);
		return obj;
	}
}