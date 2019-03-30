/*
 HW1 Taboo problem class.
 Taboo encapsulates some rules about what objects
 may not follow other objects.
 (See handout).
*/
package assign1;

import java.util.*;

public class Taboo<T> {
	private HashMap<T, Set<T>> map = new HashMap<T,Set<T>>();
	/**
	 * Constructs a new Taboo using the given rules (see handout.)
	 * @param rules rules for new Taboo
	 */
	public Taboo(List<T> rules) {
		Set<T> tmp;
		for(int i = 0; i<rules.size()-1; i++) {
			T tmpVar1 = rules.get(i);
			T tmpVar2 = rules.get(i+1);
			if(tmpVar1==null || tmpVar2 == null) continue;
			if(map.containsKey(tmpVar1)) {
				tmp = map.get(tmpVar1);
				tmp.add(tmpVar2);
			} else {
				tmp = new HashSet<T>();
				tmp.add(tmpVar2);
				map.put(tmpVar1, tmp);
			}
		}
	}
	
	/**
	 * Returns the set of elements which should not follow
	 * the given element.
	 * @param elem
	 * @return elements which should not follow the given element
	 */
	public Set<T> noFollow(T elem) {
		if(map.containsKey(elem)) return map.get(elem);
		return Collections.emptySet();
	}
	
	/**
	 * Removes elements from the given list that
	 * violate the rules (see handout).
	 * @param list collection to reduce
	 */
	public void reduce(List<T> list) {
		Iterator<T> it = list.iterator();
		T elem = null;
		if(it.hasNext()) {
			if(elem==null) elem = it.next();
			while(it.hasNext()) {
				T elem1 = it.next();
				if(map.containsKey(elem)) {
					if(map.get(elem).contains(elem1)) {
						it.remove();
					} else {
						elem = elem1;
					}
				} else {
					elem = elem1;
				}
			}
		}
	}
}
