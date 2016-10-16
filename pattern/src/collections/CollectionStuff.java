package collections;

import java.util.*;

@SuppressWarnings("unchecked")
public class CollectionStuff {

	public static void main(String[] args){
		//collections();
		//listIterator();
		listOps();
		String s;
	}
	
	private static void listOps(){
		List<Integer> list = Arrays.asList(1,2,3,4,2,1);
		Integer o = 1;
		
		//System.out.println(list.indexOf(o));
		System.out.println(list.subList(6, list.size()).indexOf(0)+1);
		
		for (int i = list.indexOf(o), j = -1; 
				i>j;
				j = i, i += list.subList(i+1, list.size()).indexOf(o) + 1
				) {
			//System.out.println(i);
		}
	}
	
	private static void listIterator(){
		List<Object> l = new ArrayList<Object>();
		Collections.addAll(l, "a", "b", "c", "d");
		ListIterator<Object> li = l.listIterator();
		System.out.println(l);
		
		li.add("x");
		li.next();
		li.remove();
		System.out.println(l);
	}
	
	private static void collections(){
		Collection c = new ArrayList();
		List al = new ArrayList();
		List ll = new LinkedList();
		HashSet hs = new HashSet();
		TreeSet ts = new TreeSet();
		
		fillCollection(ts);
		
		HashMap hm = new HashMap();
		hm.put(0, "Alfred");
		System.out.println(hm);

	}
	
	private static void fillList(List l) {
		for (int i = 0; i<5; i++) {
			l.add(i);
		}
		l.add(1);
	}
	
	private static void fillCollection(Collection c) {
		for (int i = 0; i<5; i++) {
			c.add(i);
		}
		c.remove(2);
		c.add(1);
		System.out.println(c);
	}
}
