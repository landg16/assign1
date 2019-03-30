package assign1;

import java.util.HashSet;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int longest = 0;
		int tmp = 0;
		if(str.length()==0) return 0;
		char c = str.charAt(0);
		for(int i = 0; i<str.length(); i++){
			if(c == str.charAt(i)){
				tmp++;
				if(tmp> longest) longest = tmp;
			} else {
				c = str.charAt(i);
				tmp = 1;
			}
		}
		return longest;
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		String res = "";
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
				int k = str.charAt(i) - '0';
				if(str.length()-1 == i) return res;
				for(int l = 0; l<k; l++){
					res += str.charAt(i+1);
				}
			} else {
				res += str.charAt(i);
			}
		}
		return res;
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0; i<a.length()-len+1; i++){
			hs.add(a.substring(i, i+len));
		}
		for(int i = 0; i<b.length()-len+1; i++){
			if(hs.contains(b.substring(i, i+len))) return true;
		}
		return false;
	}
}
