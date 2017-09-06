public class Triangle {
	double altitude;
	double base;

	public Triangle(double altitude, double base) {
		super();
		this.altitude = altitude;
		this.base = base;
	}

	public void square() {
		double square = altitude * base / 2;
		System.out.println("The triangle occupies total area of " + square + " cm.");
	}
}