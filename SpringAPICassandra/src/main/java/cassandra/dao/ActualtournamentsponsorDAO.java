package cassandra.dao;

import java.util.List;

import cassandra.entity.Actual_tournament_sponsor;

public interface ActualtournamentsponsorDAO {
	public Actual_tournament_sponsor createactual(Actual_tournament_sponsor actual);

	public List<Actual_tournament_sponsor> getAllActual_tournament_sponsor();

	public Actual_tournament_sponsor getActual_tournament_sponsor(int id);

	public Actual_tournament_sponsor updateActual_tournament_sponsor(Actual_tournament_sponsor Actual_tournament_sponsor);

	public void deleteActual_tournament_sponsor(int id);
}
