package acceleratedpractice;

public class Largestnum {
	public static void main(String[] args) {
		int arrr[] = {12,34,5657,4556,32};
		int i;
		int max =arrr[0];
		for(i=0;i<arrr.length;i++) {
			if(arrr[i]>max) {
				max = arrr[i];
			}
		}
		System.out.println("highest is" +max);
	}

}
