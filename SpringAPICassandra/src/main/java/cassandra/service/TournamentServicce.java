package cassandra.service;

import java.util.List;

import cassandra.entity.Tournament;

public interface TournamentServicce {
	public Tournament createtournament(Tournament tournament);

	public List<Tournament> getAllTournament();

	public Tournament getTournament(int id);

	public Tournament updateTournament(Tournament Tournament);

	public void deleteTournament(int id);
}
