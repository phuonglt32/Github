package cassandra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassandra.dao.Chess_clubDAO;
import cassandra.entity.chess_clubs;
import cassandra.service.Chess_clubService;

@Service
public class Chess_clubServiceImpl implements Chess_clubService {

	@Autowired
	private Chess_clubDAO Chess_clubDAO;
	
	
	public Chess_clubServiceImpl() {
		super();
	}

	@Override
	public chess_clubs createchess_clubs(chess_clubs chess_clubs) {
		return Chess_clubDAO.createchess_clubs(chess_clubs);
	}

	@Override
	public chess_clubs getchess_clubs(int id) {
		return Chess_clubDAO.getchess_clubs(id);
	}

	@Override
	public chess_clubs updatechess_clubs(chess_clubs chess_clubs) {
		return Chess_clubDAO.updatechess_clubs(chess_clubs);
	}

	@Override
	public void deletechess_clubs(int id) {
		Chess_clubDAO.deletechess_clubs(id);
		
	}

	@Override
	public List<chess_clubs> getAllchess_clubs() {
		return Chess_clubDAO.getAllchess_clubs();
	}
	
}
