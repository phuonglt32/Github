package phuong.dao;

import java.sql.SQLException;
import java.sql.Statement;

import phuong.entities.Players;
import phuong.entities.Tournament;
import phuong.util.Connect;

public class PlayerRegisterTour {
	Statement stmt = null;
	public PlayerRegisterTour() {
		stmt = Connect.getconnect();
	}
	
	public String PlayerRegister(int player, int tournament){
		String sql = "Insert into player_tournament_participation (player_id,tournament_id) values ("+player+","+tournament+")";
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "OK";
	}
	
	
}
