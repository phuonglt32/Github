package cassandra.entity;

import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("matches")
public class Matches {
	
	@PrimaryKey("tournamentId")
	private int tournamentId;
	
	@PrimaryKey("playerId1")
	private int playerId1;
	
	@PrimaryKey("playerId2")
	private int playerId2;
	
	@PrimaryKey("matchStartDate")
	private Date matchStartDate;
	
	@Column("matchEndDate")
	private Date matchEndDate;
	
	@Column("ResultCode")
	private int ResultCode;
	
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public int getPlayerId1() {
		return playerId1;
	}
	public void setPlayerId1(int playerId1) {
		this.playerId1 = playerId1;
	}
	public int getPlayerId2() {
		return playerId2;
	}
	public void setPlayerId2(int playerId2) {
		this.playerId2 = playerId2;
	}
	public Date getMatchStartDate() {
		return matchStartDate;
	}
	public void setMatchStartDate(Date matchStartDate) {
		this.matchStartDate = matchStartDate;
	}
	@Override
	public String toString() {
		return "Matches [tournamentId=" + tournamentId + ", playerId1=" + playerId1 + ", playerId2=" + playerId2
				+ ", matchStartDate=" + matchStartDate + "]";
	}
	public Matches(int tournamentId, int playerId1, int playerId2, Date matchStartDate) {
	
		this.playerId1 = playerId1;
		this.playerId2 = playerId2;
		this.matchStartDate = matchStartDate;
	}
	public Matches() {
	}
	
	
}
