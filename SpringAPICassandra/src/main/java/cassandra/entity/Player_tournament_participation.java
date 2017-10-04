package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("player_tournament_participation")
public class Player_tournament_participation {
	
	@PrimaryKey("playerId")
	private int playerId;
	
	@PrimaryKey("tournament")
	private int tournament;
	
	@Column("ResultCode")
	private String finalresult;
	
	
	public String getFinal_result() {
		return finalresult;
	}
	public void setFinal_result(String final_result) {
		this.finalresult = final_result;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getTournament() {
		return tournament;
	}
	public void setTournament(int tournament) {
		this.tournament = tournament;
	}
	public Player_tournament_participation(int playerId, int tournament, String finalresult) {
		super();
		this.playerId = playerId;
		this.tournament = tournament;
		this.finalresult = finalresult;
	}
	public Player_tournament_participation() {
		super();
	}
	
}
