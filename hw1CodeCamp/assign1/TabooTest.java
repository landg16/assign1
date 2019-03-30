// TabooTest.java
// Taboo class tests -- nothing provided.
package assign1;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class TabooTest {
	@Test
	public void testNofollow1() {
		List<Integer> rules = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 1, 4, 2, 4));
		Taboo<Integer> taboo = new Taboo<Integer>(rules);
		Set<Integer> result1 = new HashSet<Integer>();	
		Set<Integer> result2 = new HashSet<Integer>();
		Set<Integer> result3 = new HashSet<Integer>();	
		result2.add(2);
		result2.add(3);
		result2.add(4);
		result3.add(1);
		result3.add(4);
		//empty
		assertEquals(result1, taboo.noFollow(10));
		//ones
		assertEquals(result2, taboo.noFollow(1));
		//twos
		assertEquals(result3, taboo.noFollow(2));		
	}
	
	@Test
	public void testNofollow2() {
		List<String> rules = new ArrayList<String>(Arrays.asList("a", null, "b", null, "c", null, "a", "b"));
		Taboo<String> taboo = new Taboo<String>(rules);
		Set<String> result1 = new HashSet<String>();	
		Set<String> result2 = new HashSet<String>();
		Set<String> result3 = new HashSet<String>();
		result3.add("b");
		//empty
		assertEquals(result1, taboo.noFollow("b"));
		//empty
		assertEquals(result2, taboo.noFollow("c"));
		//a's
		assertEquals(result3, taboo.noFollow("a"));		
	}

	
	@Test
	public void testReduce1() {
		List<Integer> rules = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 1, 4, 1, 5));
		Taboo<Integer> taboo = new Taboo<Integer>(rules);
		List<Integer> before1 = new ArrayList<Integer>(Arrays.asList(1,2,1));
		List<Integer> after1 = new ArrayList<Integer>(Arrays.asList(1,1));
		
		List<Integer> before2 = new ArrayList<Integer>(Arrays.asList(1, 5));
		List<Integer> after2 = new ArrayList<Integer>(Arrays.asList(1));
		
		taboo.reduce(before1);
		taboo.reduce(before2);
		assertEquals(after1, before1);	
		assertEquals(after2, before2);		
	}
	
	@Test
	public void testReduce2() {
		List<String> rules = new ArrayList<String>(Arrays.asList("a", null, "b", null, "c", null, "a", "b"));
		Taboo<String> taboo = new Taboo<String>(rules);
		List<String> before1 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
		List<String> after1 = new ArrayList<String>(Arrays.asList("a","c","d"));
		
		List<String> before2 = new ArrayList<String>(Arrays.asList("a","b"));
		List<String> after2 = new ArrayList<String>(Arrays.asList("a"));
		
		List<String> before3 = new ArrayList<String>(Arrays.asList("e","f","j"));
		List<String> after3 = new ArrayList<String>(Arrays.asList("e","f","j"));
		
		taboo.reduce(before1);
		taboo.reduce(before2);
		taboo.reduce(before3);
		assertEquals(after1, before1);	
		assertEquals(after2, before2);	
		assertEquals(after3, before3);	
	}
}
