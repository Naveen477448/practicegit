package acceleratedpractice;

public class ReverseaSentence {
	public static void main(String[] args) {
		String input ="welcome to java session";
		String[] words = input.split(" ");
		String[] revwords = new String[words.length];
		int j=0;
		for(int i=0;i<words.length;i++) {
			revwords[j]=words[i];
			j++;
		}
		for(int k=0;k<revwords.length;k++) {
			char[] inparray = revwords[k].toCharArray();
			char[] revarray = new char[inparray.length];
			int l=0;
			for(int i=inparray.length-1;i>=0;i--) {
				revarray[l] = inparray[i];
				l++;
			}
			revwords[k] = String.valueOf(revarray);
			System.out.println(revwords[k]+ " ");
		}
		
	}

}
