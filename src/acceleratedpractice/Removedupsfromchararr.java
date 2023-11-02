package acceleratedpractice;

import java.util.HashMap;
import java.util.Map;

public class Removedupsfromchararr {
	public static void main(String[] args) {
		char[]a = "naveenisatestengineer".toCharArray();
		int n = a.length;
		Map<Character,Integer> exists = new HashMap<>();
		String st ="";
		for(int i=0;i<n;i++) {
		if(!exists.containsKey(a[i])) {
			st+=a[i];
			exists.put(a[i], 1);
		}
		}
					
		
			System.out.println(st);
	}
}
	
