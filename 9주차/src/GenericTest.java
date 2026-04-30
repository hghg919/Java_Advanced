import java.util.ArrayList;

class Tv{}
class Audio{}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("30");
//		Integer i = (Integer)list.get(2);
//		System.out.println(list);
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
//		list.add(new Audio());
//		Tv t = (Tv) list.get(0);
		Tv t = list.get(0);
		
	}

}
