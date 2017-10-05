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

}
