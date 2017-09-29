package phuong.dao;

import java.sql.SQLException;
import java.sql.Statement;

import phuong.entities.List_of_sponsor;
import phuong.entities.Tournament;
import phuong.entities.Tournament_organizers;
import phuong.util.Connect;

public class CreateTour {
	Statement stmt = null;
	public CreateTour() {
		stmt = Connect.getconnect();
	}
	
	public void createTournament(Tournament tour,List_of_sponsor spon,int organizerId){
		int organizer = organizerId;
		int sponsor = 0;
		int tourid = 0;
		String sql = "Insert into list_of_sponsor (sponsor_name,sponsor_phone) values('"+spon.getSponsorName()+"','"+spon.getSponsorPhone()+"')";
		try {
			sponsor = stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql2 = "Insert into tournament (tournament_id,organizer_id,tournament_start_date,tournamtent_end_date,tournament_name,tournament_details) values("+tour.getTournamentId()+","+organizer+",'"+tour.getTournamentStartDate()+"','"+tour.getTournamtentEndDate()+"','"+tour.getTournamentName()+"','"+tour.getTournamentDetails()+"')";
		try {
			tourid = stmt.executeUpdate(sql2,Statement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql3 = "INSERT INTO actual_tournament_sponsor (tournament_id,sponsor_id) VALUES ("+tourid+", "+sponsor+")";
		try {
			stmt.executeUpdate(sql3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
