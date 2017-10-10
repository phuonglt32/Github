package cassandra.entity;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

public class Player_tournament_participationPK {
	@PrimaryKeyColumn(name = "playerId", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private int playerId;

	@Override
	public String toString() {
		return "Player_tournament_participationPK [playerId=" + playerId + ", tournament=" + tournament + "]";
	}

	public Player_tournament_participationPK(int playerId, int tournament) {
		super();
		this.playerId = playerId;
		this.tournament = tournament;
	}

	public Player_tournament_participationPK() {
		super();
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

	@PrimaryKeyColumn(name = "tournament", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private int tournament;
}
