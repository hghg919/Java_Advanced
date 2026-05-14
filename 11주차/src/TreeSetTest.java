import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*100+1);
			set.add(num);
		}
		System.out.println(set);
	}

}
