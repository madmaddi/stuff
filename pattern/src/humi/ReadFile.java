package humi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	/**
	 * 
	 */
	protected String filePath;
	
	/**
	 * 
	 */
	private File file;
	
	/**
	 * 
	 */
	protected ArrayList<String> lines = new ArrayList<String>();

	/**
	 * 
	 * @param path
	 * @throws IOException
	 */
	public ReadFile(String path) throws IOException
	{
		this.filePath = path;
		this.readFromFile();
	}
	
	/**
	 * 
	 * @throws IOException
	 */
	protected void readFromFile() throws IOException
	{
		this.verifyFileExists();
		
		FileReader fr = new FileReader(this.file);
		BufferedReader br = new BufferedReader(fr);
		String l = null;
		
		try {
			while( (l = br.readLine()) != null ) {
				this.lines.add(l);
			}
		} catch ( NullPointerException e ) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	protected boolean verifyFileExists() throws IOException
	{
		this.file = new File(this.filePath);
		if (! this.file.isFile() ) throw new IOException();
		return true;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getLines() {
		return this.lines;
	}
}
