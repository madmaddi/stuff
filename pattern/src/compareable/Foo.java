package compareable;

public class Foo implements Comparable<Foo>{
	public int f;

	@Override
	public int compareTo(Foo o) {
		Foo foo = (Foo) o;
		if (this.f > foo.f) return 1;
		if (this.f < foo.f) return -1;
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this.compareTo((Foo)o) == 0) return true;
		return false;
	}
}
