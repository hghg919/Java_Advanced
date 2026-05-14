import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		set.add("MILK");
		set.add("BREAD");
		set.add("BUTTER");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		
		if(set.contains("Ham")) {
			System.out.println("햄도 포함되어 있음");
		}
	}

}
