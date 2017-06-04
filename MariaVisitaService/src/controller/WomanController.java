package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import model.Woman;

@Path("woman")
public class WomanController {

	@GET
	@Path("save")
	public String save(Woman woman) {
		return "ola";
	}
	
}