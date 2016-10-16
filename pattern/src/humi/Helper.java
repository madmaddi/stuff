package humi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Helper {
	
	
	public static HashMap<String, ArrayList<EntryEntity>> createHashMap(ArrayList<EntryEntity> el){
		HashMap<String, ArrayList<EntryEntity>> map = new HashMap<String, ArrayList<EntryEntity>>();
		
		for(EntryEntity e: el) {
			ArrayList<EntryEntity> alTemp = new ArrayList<EntryEntity>();
			// insert new key-value pair
			if (!map.containsKey(e.keyTime)) {
				
				alTemp.add(e);
				map.put(e.keyTime, alTemp);
				continue;
			}
			
			// add Entity to existing key
			alTemp = map.get(e.keyTime);
			alTemp.add(e);
		}
		
		return map;
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static EntryEntity createEntryEntityFromString(String s){
		String[] parts = s.split("#");
		return new EntryEntity(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public static String formatDateFromTimestamp(Integer i) {
		Date t = new Date((long)i*1000);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(t);
	}
}
