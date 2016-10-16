package humiMeasure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import java.util.Collections;
import java.util.TreeMap;

public class Helper {
	
	
	public static TreeMap<String, ArrayList<EntryEntity>> createTreeMap(ArrayList<EntryEntity> el){
				//TreeMap<String, ArrayList<EntryEntity>> map = new TreeMap<String, ArrayList<EntryEntity>>();
		TreeMap<String, ArrayList<EntryEntity>> map = new TreeMap<String, ArrayList<EntryEntity>>(Collections.reverseOrder());
		
		EntryEntityComparator eec = new EntryEntityComparator();
		ArrayList<EntryEntity> alTemp;
		
		for(EntryEntity entity: el) {
			
			// insert new key-value pair			
			if ( !map.containsKey(entity.keyTime)) {
				map.put(entity.keyTime, new ArrayList<EntryEntity>());
			}
			
			alTemp = map.get(entity.keyTime);
			alTemp.add(entity);
		}
		
		for ( ArrayList<EntryEntity> l : map.values() ) {
			Collections.sort(l, eec);
		}
		
		return map;
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static EntryEntity createEntryEntityFromString(String s) throws Exception
	{
		String[] parts = s.split("#");
		if (parts.length < 3 ) throw new Exception("Invalid data input");
		return new EntryEntity(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public static String formatDateFromTimestamp(Integer i, String pattern) {
		Date t = new Date((long)i*1000);
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(t);
	}
}
