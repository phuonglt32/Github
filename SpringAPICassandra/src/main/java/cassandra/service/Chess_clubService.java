package cassandra.service;

import java.util.List;

import cassandra.entity.Employee;
import cassandra.entity.chess_clubs;

public interface Chess_clubService {
	public chess_clubs createchess_clubs(chess_clubs chess_clubs);

	/**
	 * Getting the Employee Information using Id
	 * 
	 * @param id
	 * @return {@link Employee}
	 */
	public chess_clubs getchess_clubs(int id);

	/**
	 * Used to Update the Employee Information
	 * 
	 * @param employee
	 * @return {@link Employee}
	 */

	public chess_clubs updatechess_clubs(chess_clubs chess_clubs);

	/**
	 * Deleting the Employee Information using Id
	 * 
	 * @param id
	 */
	public void deletechess_clubs(int id);

	/**
	 * Getting the All Employees information
	 * 
	 * @return
	 */
	public List<chess_clubs> getAllchess_clubs();
}
