package cassandra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassandra.dao.ListofsponsorDAO;
import cassandra.entity.List_of_sponsor;
import cassandra.service.ListofsponsorService;

@Service
public class ListofsponsorServiceImpl implements ListofsponsorService {

	@Autowired
	private ListofsponsorDAO listofsponsor;
	
	
	public ListofsponsorServiceImpl() {
		super();
	}
	@Override
	public List_of_sponsor createsponsor(List_of_sponsor sponsor) {
		return listofsponsor.createsponsor(sponsor);
	}
	
}
