package io;

import java.io.File;
import java.io.FilenameFilter;

public class JpgFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return ( new File(dir, name).isFile() && (name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".jpeg"))); 
	}
	
}
