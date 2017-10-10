package cassandra.service.impl;

import java.util.List;

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

	@Override
	public Actual_tournament_sponsor getActual_tournament_sponsor(int id) {
		return actualDAO.getActual_tournament_sponsor(id);
	}

	@Override
	public Actual_tournament_sponsor updateActual_tournament_sponsor(
			Actual_tournament_sponsor Actual_tournament_sponsor) {
		return actualDAO.updateActual_tournament_sponsor(Actual_tournament_sponsor);
	}

	@Override
	public void deleteActual_tournament_sponsor(int id) {
		actualDAO.deleteActual_tournament_sponsor(id);
		
	}

	@Override
	public List<Actual_tournament_sponsor> getAllActual_tournament_sponsors() {
		return actualDAO.getAllActual_tournament_sponsor();
	}

}
