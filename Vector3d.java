
public class Vector3d {
	int x;
	int y;
	int z;

	public Vector3d(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d sum(Vector3d v1, Vector3d v2) {

		Vector3d sum = new Vector3d();
		sum.x = v1.x + v2.x;
		sum.y = v1.y + v2.y;
		sum.z = v1.z + v2.z;
		return sum;
	}
}