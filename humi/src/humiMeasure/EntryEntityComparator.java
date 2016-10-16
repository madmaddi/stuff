package humiMeasure;

import java.util.Comparator;

public class EntryEntityComparator implements Comparator<EntryEntity>{

	@Override
	public int compare(EntryEntity o1, EntryEntity o2) {
		// TODO Auto-generated method stub
		if ( o1.time < o2.time ) return 1;
		if ( o1.time > o2.time ) return -1;
		return 0;
	}

}

