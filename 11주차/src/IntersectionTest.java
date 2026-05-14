import java.util.*;

public class IntersectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(2,4,6,8));
		
		s1.retainAll(s2);
		System.out.println(s1);
	}

}
