package phuong.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import phuong.dao.PlayerRegisterTour;
import phuong.dao.chess_clubRepo;
import phuong.entities.Chess_club;

@Path("/playerregtour")
public class playerregtour {
	PlayerRegisterTour playerregtour = new PlayerRegisterTour();

	//
	// http://localhost:8080/contextPath/rest/weather/{location}/{date}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago/2016-09-27
	// http://localhost:8080/contextPath/rest/weather/hanoi/2016-09-27
	//

	

	@Path("{idplayer}/{tourid}")
	@GET
	@Produces("application/json")
	public String Register(@PathParam("idplayer") int idplayer, //
			@PathParam("tourid") int tourid) {
		return playerregtour.PlayerRegister(idplayer,tourid);
	}

}
