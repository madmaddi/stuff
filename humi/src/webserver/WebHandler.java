package webserver;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileReader;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import humiMeasure.EntryEntity;

public class WebHandler implements HttpHandler{
	
	TreeMap<String, ArrayList<EntryEntity>> map;
	
	public WebHandler(TreeMap<String, ArrayList<EntryEntity>> map) 
	{
		this.map = map;
	}
	
	public void handle (HttpExchange exchange) throws IOException {
		exchange.getResponseHeaders().add("Content-type", "text/html");
		String response = this.getHtmlHead();
		response += this.getContent();
		response += this.getData();
		
		response += "</body></html>";
		exchange.sendResponseHeaders(200, response.length());
		
		OutputStream os = exchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}

	
	/**
	 * 
	 * @return
	 */
	protected String getData(){
				
		String resp = "<table border='1'>";
		String bgColor = "green";
		int i = 1;
		System.out.println("ttt");
		for ( Map.Entry<String, ArrayList<EntryEntity>> e : this.map.entrySet() ) {
			resp += "<tr valign='top'><td>";
			resp += "</td><td>";
			resp += e.getKey();
			resp += "</td><td>";
			
			// @todo string generierung ist sehr ineffektiv
			for (EntryEntity entity : e.getValue()) {
				resp += Integer.valueOf(i++);
				
				resp += "&nbsp; <span class='entity'>"
						+"<span class='entityTime' style='display:none'>"+ entity.time + "</span>"
						+ entity.dayTime
						+ "- <span class='entityTemperature'>" + entity.temperature + "</span> Grad C - ";
						
				if (entity.humidity >= 70) {
					bgColor = "red";
				} else { 
					bgColor = "green";
				}
				
				resp += "<span class='entityHumidity' style='background-color:"+ bgColor +"'>" + entity.humidity + "</span>% </span><br/>";
				
			}			
			
			resp +="</td></tr>";
		}
		
		resp += "</table>";
		
		return resp;
	}
	
	protected String getContent() {
		return "<div class='demo-container'>"
			+ "		<div id='placeholder' class='demo-placeholder'></div>"
			+ "</div>"
			+ "<div class='demo-container' style='height:150px;'>"
			+ "		<div id='overview' class='demo-placeholder'></div>"
			+ "	</div>"
			+ "<script language='javascript' type='text/javascript' src='http://192.168.20.216/graph.js'></script>";
	}
	
	protected String getHtmlHead(){
		String s = "<!DOCTYPE html><html><head>"
				+ "<link href='http://192.168.20.216/flot/examples/examples.css' rel='stylesheet' type='text/css'>"
				+ "<script language='javascript' type='text/javascript' src='http://192.168.20.216/flot/jquery.js'></script>"
				+ "<script language='javascript' type='text/javascript' src='http://192.168.20.216/flot/jquery.flot.js'></script>"
				+ "<script language='javascript' type='text/javascript' src='http://192.168.20.216/flot/jquery.flot.time.js'></script>"
				+ "<script language='javascript' type='text/javascript' src='http://192.168.20.216/flot/jquery.flot.selection.js'></script>"
				+ "<script type='text/javascript'>"
				+ "$(function() {"
				+ "	$('#footer').prepend('Flot ' + $.plot.version + ' &ndash; ');"
				+ "});"
				
				+ "</script>"
				+ "</head><body>";
		return s;
	}
}
