package cassandra.dao.impl;

import java.util.List;

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

	@Override
	public List_of_sponsor getList_of_sponsor(int id) {
		return myCassandraTemplate.findById(id,List_of_sponsor.class);
	}

	@Override
	public List_of_sponsor updateList_of_sponsor(List_of_sponsor List_of_sponsor) {
		return myCassandraTemplate.update(List_of_sponsor);
	}

	@Override
	public void deleteList_of_sponsor(int id) {
		myCassandraTemplate.deleteById(id, List_of_sponsor.class);
		
	}

	@Override
	public List<List_of_sponsor> getAllList_of_sponsor() {
		return myCassandraTemplate.findAll(List_of_sponsor.class);
	}

}
