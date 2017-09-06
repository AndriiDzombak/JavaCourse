
public class Cat {
	String color;
	int height;
	int weight;
	int tailLength;

	public Cat(String color, int height, int weight, int tailLength) {
		super();
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.tailLength = tailLength;
	}

	public void catLength() {
		int length = height + tailLength;
		System.out.print("This cat is " + color + " and its total length is " + length + " cm with weight of " + weight
				+ " kg. ");
	}

	public void getThroughWindowBars() {
		if (weight >= 7) {
			System.out.println("It's so obese that can't even get through the window bars.");
		} else {
			System.out.println("It's easy enough to fly.");
		}
	}
}

