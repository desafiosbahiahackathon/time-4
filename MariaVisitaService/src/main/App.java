package main;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import persistence.Connection;

@ApplicationPath("rest")
public class App extends ResourceConfig {

	public App() {
		packages("controller");
		Connection conn = Connection.getInstance();
		conn.connect("mongodb://localhost", "MuralUniversitario");
	}
	
}