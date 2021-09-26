public class Lab02 {
	public static double[] map(UnaryFunction unary, double[] arr) {
        double[] arr2 = new double[arr.length];
        for (int i=0; i<arr.length; i++) {
            arr2[i] += unary.exec(arr[i]);
        }
        return arr2;
    }
}
