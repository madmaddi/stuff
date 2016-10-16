package compareable;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		Foo f3 = new Foo();
		Foo f4 = new Foo();
		Foo f5 = new Foo();
		
		f1.f = 10;
		f2.f = 230;
		f3.f = 20;
		f4.f = 5;
		f5.f = 30;
		
		List<Foo> l = Arrays.asList(f1,f2,f3,f4,f5);
		
		ComparatorStuff cs = new ComparatorStuff();
		//System.out.println(cd.compare(f3, f2));
		//System.out.println(f1.compareTo(f2));
		//System.out.println(f1.equals(f3));
		
		System.out.println(Collections.max(l, cs).f);
		
		Collections.sort(l, cs);
		for (Foo f: l) System.out.println(f.f);
		
	}

}
