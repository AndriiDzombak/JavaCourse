
public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------First task----------------------");

		Cat catOne = new Cat("grey", 25, 6, 15);
		catOne.catLength();
		catOne.getThroughWindowBars();

		Cat catTwo = new Cat("black", 24, 10, 14);
		catTwo.catLength();
		catTwo.getThroughWindowBars();

		System.out.println("----------------------Second task----------------------");

		Triangle triangleOne = new Triangle(3, 6);
		triangleOne.square();

		Triangle triangleTwo = new Triangle(3.5, 6.5);
		triangleTwo.square();

		System.out.println("Got to do till this point. The rest for later");

		/*//System.out.println("----------------------Third task----------------------");
		//Vector3d VectorOne = new Vector3d(1, 0, 2);
		//Vector3d VectorTwo = new Vector3d(2, 1, -2);
		//sum(VectorOne, VectorTwo);*/
	}
}