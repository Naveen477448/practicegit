package acceleratedpractice;

public class Sortinastring {
	public static void main(String[] args) {
		String[] names = {"naveen","rutu","jaddu","dube","raina"};
		String temp;
		
		System.out.println("the array string is :");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" ");
		}
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("the sorted array is :");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" ");
		}
	}

}
