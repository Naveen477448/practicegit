package acceleratedpractice;

public class Secondlargest {
public static void main(String[] args) {
	int marks[] = {35,45,56,78,90,89,78};
	int largest = marks[0];
	int secondlargest = marks[0];
	
	System.out.println("the marks are :");
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]+ " ");
	}
	for(int i=0;i<marks.length;i++) {
		if(marks[i]>largest) {
			secondlargest = largest;
			largest = marks[i];
		}
		else if(marks[i]>secondlargest) {
			secondlargest = marks[i];
		}
		
	}
	System.out.println("the second highest is : " +secondlargest);
}
}
