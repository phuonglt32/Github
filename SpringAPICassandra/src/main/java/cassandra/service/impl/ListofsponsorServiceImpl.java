package cassandra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassandra.dao.ListofsponsorDAO;
import cassandra.entity.List_of_sponsor;
import cassandra.service.ListofsponsorService;

@Service
public class ListofsponsorServiceImpl implements ListofsponsorService {

	@Autowired
	private ListofsponsorDAO listofsponsorDAO;
	
	
	public ListofsponsorServiceImpl() {
		super();
	}
	@Override
	public List_of_sponsor createsponsor(List_of_sponsor sponsor) {
		return listofsponsorDAO.createsponsor(sponsor);
	}
	@Override
	public List_of_sponsor getList_of_sponsor(int id) {
		return listofsponsorDAO.getList_of_sponsor(id);
	}
	@Override
	public List_of_sponsor updateList_of_sponsor(List_of_sponsor List_of_sponsor) {
		return listofsponsorDAO.updateList_of_sponsor(List_of_sponsor);
	}
	@Override
	public void deleteList_of_sponsor(int id) {
		listofsponsorDAO.deleteList_of_sponsor(id);
		
	}
	@Override
	public List<List_of_sponsor> getAllList_of_sponsors() {
		return listofsponsorDAO.getAllList_of_sponsor();
	}
	
}
