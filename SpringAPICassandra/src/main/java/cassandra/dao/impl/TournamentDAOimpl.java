package cassandra.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cassandra.dao.TournamentDAO;
import cassandra.entity.Tournament;
import cassandra.util.MyCassandraTemplate;

@Repository
public class TournamentDAOimpl implements TournamentDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;
	
	
	@Override
	public Tournament createstournament(Tournament tournament) {
		return myCassandraTemplate.create(tournament);
	}


	@Override
	public List<Tournament> getAllTournament() {
		return myCassandraTemplate.findAll(Tournament.class);
	}


	@Override
	public Tournament getTournament(int id) {
		return myCassandraTemplate.findById(id, Tournament.class);
	}


	@Override
	public Tournament updateTournament(Tournament Tournament) {
		return myCassandraTemplate.update(Tournament);
	}


	@Override
	public void deleteTournament(int id) {
		myCassandraTemplate.deleteById(id, Tournament.class);
		
	}

}
