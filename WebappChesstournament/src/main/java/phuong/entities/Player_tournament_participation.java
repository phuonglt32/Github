package phuong.entities;

public class Player_tournament_participation {
	private int playerId;
	private int tournament;
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
	public Player_tournament_participation(int playerId, int tournament) {
		super();
		this.playerId = playerId;
		this.tournament = tournament;
	}
	public Player_tournament_participation() {
		super();
	}
	
}
