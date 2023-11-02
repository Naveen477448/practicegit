package acceleratedpractice;

public class Sumofarr {
	public static void main(String[] args) {
		int arr[]= {12,34,56,75};
		int i;
		int sum =0;
		
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum of array is" +sum);
	}

}
