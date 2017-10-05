package cassandra.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cassandra.dao.ListofsponsorDAO;
import cassandra.entity.List_of_sponsor;
import cassandra.util.MyCassandraTemplate;

@Repository
public class ListofsponsorDAOimpl implements ListofsponsorDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;
	
	@Override
	public List_of_sponsor createsponsor(List_of_sponsor sponsor) {
		return myCassandraTemplate.create(sponsor);
	}

}
