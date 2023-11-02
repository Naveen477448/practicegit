package acceleratedpractice;
import java.util.Set;
import java.util.LinkedHashSet;

public class Removedusfromintarray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,4,3,2,1};
		
		Set<Integer> sett = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
		sett.add(a[i]);
	}
		System.out.println(sett);
	}
}
