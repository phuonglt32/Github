package cassandra.dao;

import java.util.List;

import cassandra.entity.Tournament;

public interface TournamentDAO {
	public Tournament createstournament(Tournament tournament);
	public List<Tournament> getAllTournament();
}
