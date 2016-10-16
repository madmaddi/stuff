package io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) {

		try {
			File f = File.createTempFile("/tmp/b", "ll");
			System.out.println(f.getCanonicalFile());
			System.out.println(f.getName());
			System.out.println(f.length());
			System.out.println(String.valueOf(f.canRead()) + String.valueOf(f.canWrite()) + String.valueOf(f.canExecute()));
			f.setExecutable(true);
			System.out.println(String.valueOf(f.canRead()) + String.valueOf(f.canWrite()) + String.valueOf(f.canExecute()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (File f : File.listRoots()) {	
			System.out.printf("%s    %6d MB    %6d MB    %6d MB%n", 
								f,
								f.getTotalSpace() / (1024*1024),
								f.getFreeSpace()/ (1024*1024),
								f.getUsableSpace()/ (1024*1024)
								);
			
			for ( File f1 : f.listFiles()) {
				System.out.println(f1.getAbsolutePath());
			}
		}
		
		

		System.out.println("#####");
		
		File[] fList = new File("/tmp/").listFiles(new JpgFilter());
		
		
		// #############
		fList = new File("/tmp/").listFiles(
					new FileFilter(){
						@Override 
						public boolean accept( File f) {
							return f.isDirectory();
						}
					}
			);
		
		System.out.println(fList);
		for (File f : fList) {
			System.out.println(f);
		}
		
		FileDelete.deleteDirectory(new File("/tmp/a/b/c1"));
		
	}

}
