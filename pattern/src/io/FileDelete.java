package io;

import java.io.File;

public class FileDelete {
	public static void deleteDirectory(File f) {
		
		if ( f.isDirectory()) {
			for (File fr : f.listFiles() ) {
				deleteDirectory(fr);
			}
		}
		
		f.delete();
	}
}
