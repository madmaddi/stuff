package compareable;

import java.util.Comparator;

public class ComparatorStuff implements Comparator<Foo>{

	@Override
	public int compare(Foo i1, Foo i2){
		if (i1.f > i2.f) return 1;
		if (i1.f < i2.f) return -1;
		return 0;
	}

}
