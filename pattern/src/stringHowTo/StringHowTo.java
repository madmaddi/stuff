package stringHowTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.ArrayList;

public class StringHowTo {

	public static void main(String[] args){
		StringHowTo s = new StringHowTo();
		ArrayList<String> l = s.getData();
		for (String dataString : l) {
			System.out.println(dataString);
		}
	}
	
	protected ArrayList<String> getData(){
		ArrayList<String> data = new ArrayList<String>();
		
		try {
			
			String filePath = "/home/mop/axilaris/workspace/pattern/pattern/src/stringHowTo/data.txt";
			/*FileReader fileReader = new FileReader(filePath);
			for ( int c; (c = fileReader.read()) != -1;) {
				//System.out.println((char)c);
			}*/
			
			File file = new File(filePath);
			RandomAccessFile raf = new RandomAccessFile(file,"r");
			String line;
			String writeLine;
			String[] splits;
			
			while ( (line = raf.readLine()) != null) {
				
				splits = line.split("#");
				
				if (splits.length < 3) continue;
				
				Date date = new Date(Long.valueOf(splits[0]) * 1000);
				
				//System.out.println(date);
				
				writeLine = date + " - " + splits[1] + "°C - " + splits[2] + "%"; 
				
				data.add(writeLine);
				//break;
			}
			raf.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
		
	}
}
