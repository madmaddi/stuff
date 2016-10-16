package webserver;

import com.sun.net.httpserver.*;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HttpWebServer {

	WebHandler handler;
	public HttpWebServer(WebHandler handler) {
		this.handler = handler;
	}
	public void start() throws IOException{
		
		
		HttpServer server = HttpServer.create( new InetSocketAddress(8080), 0);
		//server.createContext("/", new WebHandler());
		server.createContext("/", this.handler);
		server.start();
	}
}
