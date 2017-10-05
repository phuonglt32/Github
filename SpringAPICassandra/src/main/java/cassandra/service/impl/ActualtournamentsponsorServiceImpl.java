package cassandra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassandra.dao.ActualtournamentsponsorDAO;
import cassandra.entity.Actual_tournament_sponsor;
import cassandra.service.ActualtournamentsponsorService;

@Service
public class ActualtournamentsponsorServiceImpl implements ActualtournamentsponsorService {

	@Autowired
	private ActualtournamentsponsorDAO actualDAO;
	
	
	public ActualtournamentsponsorServiceImpl() {
		super();
	}
	
	@Override
	public Actual_tournament_sponsor createactual(Actual_tournament_sponsor actual) {
		return actualDAO.createactual(actual);
	}

}
