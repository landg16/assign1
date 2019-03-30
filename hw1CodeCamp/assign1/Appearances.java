package assign1;

import java.util.*;

public class Appearances {
	
	/**
	 * Returns the number of elements that appear the same number
	 * of times in both collections. Static method. (see handout).
	 * @return number of same-appearance elements
	 */
	public static <T> int sameCount(Collection<T> a, Collection<T> b) {
		HashMap<T, ArrayList<Integer>> map = fillMap(a,b);
		int result = countResult(map);
		return result; // TODO ADD CODE HERE
	}
	
	private static <T> int countResult(HashMap<T, ArrayList<Integer>> map) {
		int count = 0;
		Iterator<T> it = map.keySet().iterator();
		while(it.hasNext()) {
			T tmp = it.next();
			ArrayList<Integer> arr = map.get(tmp);
			if(arr.get(0)==arr.get(1)) count++;
		}
		return count;
	}
	
	private static <T> HashMap<T, ArrayList<Integer>> fillMap(Collection<T> a, Collection<T> b){
		HashMap<T, ArrayList<Integer>> map = new HashMap<T, ArrayList<Integer>>();
		ArrayList<Integer> tmp;
		for (T x : a) {
			if(map.containsKey(x)) {
				tmp = map.get(x);
				tmp.set(0, tmp.get(0)+1);
			} else {
				for(T y : b) {
					if(x.equals(y)) {
						if(map.containsKey(x)) {
							tmp = map.get(x);
							tmp.set(1, tmp.get(1)+1);
						} else {
							tmp = new ArrayList<Integer>();
							tmp.add(1);
							tmp.add(1);
						}
						map.put(x, tmp);
					}
				}
			}
		}
		return map;
	}
}
