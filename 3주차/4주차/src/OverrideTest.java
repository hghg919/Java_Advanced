class Mypoint3 {
	int x;
	int y;
	String getLocation() {
		return "x:" +x+", y:"+y;
	}
}
class Mypoint3D extends Mypoint3 {
	int z;
	String getLocation() {
		return "x:" +x+", y:"+y+", z:"+z;
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint3D p = new Mypoint3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
	}

}
