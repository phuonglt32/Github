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

import phuong.dao.PlayerRegisterTour;
import phuong.dao.chess_clubRepo;
import phuong.entities.Chess_club;
import phuong.entities.Tournament;

@Path("/newtour")
public class CreateTour {
	phuong.dao.CreateTour createtour = new phuong.dao.CreateTour();

	//
	// http://localhost:8080/contextPath/rest/weather/{location}/{date}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago/2016-09-27
	// http://localhost:8080/contextPath/rest/weather/hanoi/2016-09-27
	//
	@Path("new")
	@POST
	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	public String CreateNewTour( //
			@FormParam("organizerid") int organizerid, //
			@FormParam("tourstartdate") String tourstartdate, //
			@FormParam("tourenddate") String tourenddate, //
			@FormParam("tourname") String tourname, //
			@FormParam("tourdetails") String tourdetails, //
			@FormParam("sponname") String sponname, //
			@FormParam("sponphone") String sponphone) {

		Tournament tournament = new Tournament(organizerid, tourstartdate, tourenddate, tourname, tourdetails);
		return "" + organizerid;
	}

}
