package tester;
import com.app.geometry.*;
public class TestPointer {

	public static void main(String[]args) {
		TestPointer t=new TestPointer();
		Point2D p1=new Point2D();
		p1.accept();
		p1.getDetails();
		System.out.println("************p2***********");
		Point2D p2=new Point2D();
		p2.accept();
		p2.getDetails();
		
		p2.calculateDistance(p1, p2);
		p1.isEqual(p1, p2);
		
	}
}

