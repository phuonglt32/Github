package cassandra.dao.impl;

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

}
