public class ArrayProcessor1{
	public static void main(String[] args){
		double[] a = {3, 6.5, 2, -6, 19, 0, 3};
		double min = Double.MAX_VALUE;
		int minIndex = 0; 
		int maxIndex = 0; 

		double max = Double.MIN_VALUE;
		double avg = 0;
		for(int i=0; i < a.length; i++){
			if (a[i] < min){
				min = a[i];
				minIndex = i;

			}
			if (a[i] > max){
				max = a[i];
				maxIndex = i;
			}
			avg += a[i];
		}
		avg /= a.length;
		System.out.println(min + "\t" + max + "\t" + avg 
			+ "\t" + minIndex + "\t" + maxIndex);
	}
}