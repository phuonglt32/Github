package cassandra.dao;

import java.util.List;

import cassandra.entity.List_of_sponsor;

public interface ListofsponsorDAO {
	public List_of_sponsor createsponsor(List_of_sponsor sponsor);

	public List_of_sponsor getList_of_sponsor(int id);

	public List_of_sponsor updateList_of_sponsor(List_of_sponsor List_of_sponsor);

	public void deleteList_of_sponsor(int id);

	public List<List_of_sponsor> getAllList_of_sponsor();
}
