public class geometricSm {
	public static void main(String[] args) {
		System.out.println(findGeometricSum(5));
	}

	public static double findGeometricSum(int k) {
		// Write your code here
		if (k == 0) {
			return 1;
		}
		double sum = (1 / Math.pow(2, k)) + findGeometricSum(k - 1);

		return sum;
	}
}
