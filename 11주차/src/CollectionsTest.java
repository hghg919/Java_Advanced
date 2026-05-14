import java.util.*;

public class CollectionsTest {

		public static void main(String args[]) {
			List<String> list= new LinkedList<String>();

			list.add("김철수");
			list.add("김영희");
			list.add("이나영");

			Collections.sort(list);
			System.out.println(list);
		}

}