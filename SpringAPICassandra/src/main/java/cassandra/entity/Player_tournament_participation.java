package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("player_tournament_participation")
public class Player_tournament_participation {
	
	@PrimaryKey
	private Player_tournament_participationPK pk;
	
	@Column("ResultCode")
	private String finalresult;
	
	
	public String getFinal_result() {
		return finalresult;
	}
	public void setFinal_result(String final_result) {
		this.finalresult = final_result;
	}
	
	public Player_tournament_participation(Player_tournament_participationPK pk, String finalresult) {
		super();
		this.pk = pk;
		this.finalresult = finalresult;
	}
	public Player_tournament_participationPK getPk() {
		return pk;
	}
	public void setPk(Player_tournament_participationPK pk) {
		this.pk = pk;
	}
	public String getFinalresult() {
		return finalresult;
	}
	public void setFinalresult(String finalresult) {
		this.finalresult = finalresult;
	}
	public Player_tournament_participation() {
		super();
	}
	
}
