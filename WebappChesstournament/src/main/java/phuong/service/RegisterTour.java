package phuong.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import phuong.dao.chess_clubRepo;
import phuong.entities.Chess_club;

@Path("/tour")
public class RegisterTour {
	chess_clubRepo chre = new chess_clubRepo();;
	// private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	//
	// http://localhost:8080/contextPath/rest/weather/{location}/{date}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago/2016-09-27
	// http://localhost:8080/contextPath/rest/weather/hanoi/2016-09-27
	//

	@Path("{name}/{address}/{organizer}")
	@GET
	@Produces("application/json")
	public String getWeather_JSON(@PathParam("name") String name, //
			@PathParam("address") String address, @PathParam("organizer") int organizer) {
		Chess_club ch = new Chess_club(name, address, organizer);

		chre.save(ch);
		return "{" //
				+ "'name' : '" + name + "'," //
				+ "'address' : '" + address + "'," //
				+ "'organizer' : '" + organizer + "'" //
				+ "}";

	}

	//
	// http://localhost:8080/contextPath/rest/weather/{location}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago
	// http://localhost:8080/contextPath/rest/weather/hanoi
	//
	@Path("{name}")
	@GET
	@Produces("application/json")
	public String getWeather_JSON(@PathParam("name") String name) {
		return chre.findTour(name);
	}

	@Path("club")
	@POST
	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	public String getclub(@FormParam("name") String name) {
		//return chre.getAllclub();
		return name;
	}

}
