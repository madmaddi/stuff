package humi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ReadFile rf = new ReadFile("/home/mop/axilaris/workspace/pattern/pattern/src/humi/data.txt");
			ArrayList<EntryEntity> el = new ArrayList<EntryEntity>();
			
			for(String s : rf.getLines()) {
				el.add(Helper.createEntryEntityFromString(s));
			}
			
			HashMap<String, ArrayList<EntryEntity>> map = Helper.createHashMap(el);
			
			System.out.println(map);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
