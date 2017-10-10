package cassandra.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cassandra.dao.ActualtournamentsponsorDAO;
import cassandra.entity.Actual_tournament_sponsor;
import cassandra.util.MyCassandraTemplate;

@Repository
public class ActualtournamentsponsorDAOimpl implements ActualtournamentsponsorDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;
	
	
	@Override
	public Actual_tournament_sponsor createactual(Actual_tournament_sponsor actual) {
		return myCassandraTemplate.create(actual);
	}


	@Override
	public List<Actual_tournament_sponsor> getAllActual_tournament_sponsor() {
		return myCassandraTemplate.findAll(Actual_tournament_sponsor.class);
	}


	@Override
	public Actual_tournament_sponsor getActual_tournament_sponsor(int id) {
		return myCassandraTemplate.findById(id, Actual_tournament_sponsor.class);
	}


	@Override
	public Actual_tournament_sponsor updateActual_tournament_sponsor(
			Actual_tournament_sponsor Actual_tournament_sponsor) {
		return myCassandraTemplate.update(Actual_tournament_sponsor);
	}


	@Override
	public void deleteActual_tournament_sponsor(int id) {
		myCassandraTemplate.deleteById(id, Actual_tournament_sponsor.class);
		
	}

}
