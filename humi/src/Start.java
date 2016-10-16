
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import humiMeasure.EntryEntity;
import humiMeasure.Helper;
import humiMeasure.ReadFile;

import webserver.HttpWebServer;
import webserver.WebHandler;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ReadFile rf = new ReadFile("/home/pi/workspace/raspi-sensorkit/permanent-humidity-measure/data");
			
			ArrayList<EntryEntity> el = new ArrayList<EntryEntity>();
			for(String s : rf.getLines()) {
				try {
					el.add(Helper.createEntryEntityFromString(s));
					//System.out.println(s);
				} catch (Exception e) {
					e.printStackTrace();
				}		
			}
			
			//System.out.println(el);
			TreeMap<String, ArrayList<EntryEntity>> map = Helper.createTreeMap(el);
			//System.out.println(map);
			System.out.println("letsgo");
			WebHandler handler = new WebHandler(map);
			HttpWebServer hws = new HttpWebServer(handler);
			hws.start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
