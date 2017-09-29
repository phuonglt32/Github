package phuong.entities;

import java.util.Date;

public class Matches {
	private int tournamentId;
	private int playerId1;
	private int playerId2;
	private Date matchStartDate;
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
