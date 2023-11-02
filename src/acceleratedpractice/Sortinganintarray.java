package acceleratedpractice;

public class Sortinganintarray {
	public static void main(String[] args) {
		int a[] =new int[] {12,34,5,67,78,90};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp =0;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}
