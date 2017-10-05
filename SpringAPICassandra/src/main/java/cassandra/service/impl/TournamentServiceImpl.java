package cassandra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassandra.dao.TournamentDAO;
import cassandra.entity.Tournament;
import cassandra.service.TournamentServicce;

@Service
public class TournamentServiceImpl implements TournamentServicce {
	@Autowired
	private TournamentDAO tournamentDAO;
	
	
	public TournamentServiceImpl() {
		super();
	}


	@Override
	public Tournament createtournament(Tournament tournament) {
		return tournamentDAO.createstournament(tournament);
	}


	@Override
	public List<Tournament> getAllTournament() {
		return tournamentDAO.getAllTournament();
	}
	
	
}
