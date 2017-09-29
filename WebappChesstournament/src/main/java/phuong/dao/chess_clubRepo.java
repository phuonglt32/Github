package phuong.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import phuong.entities.Chess_club;
import phuong.util.Connect;

public class chess_clubRepo {
	Statement stmt = null;

	public chess_clubRepo() {
		stmt = Connect.getconnect();
	}
	
	public String save(Chess_club ch) {
		String sql = "INSERT INTO chess_clubs (club_name,club_address,organizer_id) values ('"+ch.getClubName()+"','"+ch.getClubAddress()+"','"+ch.getOrganizerId()+"')";
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "200";
	}

	public String getAllclub() {
		String sql = "SELECT * FROM chess_clubs JOIN tournament_organizers WHERE tournament_organizers.organizer_id = chess_clubs.organizer_id";
		String result = "";
		ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("club_id");
				String Club_name = rs.getString("club_name");
				String Club_address = rs.getString("club_address");
				String Club_organizer = rs.getString("organizer_name");

				result +=  "{" //
						+ "\"name\": \"" + Club_name + "\"," //
						+ "\"address\": \"" + Club_address + "\"," //
						+ "\"organizer\": \"" + Club_organizer + "\"" //
						+ "} ";
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
	
	public String findTour(String name) {
		String sql = "SELECT * FROM chess_clubs JOIN tournament_organizers ON tournament_organizers.organizer_id = chess_clubs.organizer_id WHERE club_name like '%"+name+"'";
		String result = "";
		ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("club_id");
				String Club_name = rs.getString("club_name");
				String Club_address = rs.getString("club_address");
				String Club_organizer = rs.getString("organizer_name");

				result +=  "{" //
						+ "\"name\": \"" + Club_name + "\"," //
						+ "\"address\": \"" + Club_address + "\"," //
						+ "\"organizer\": \"" + Club_organizer + "\"" //
						+ "} ";
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

}
