package cassandra.dao.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cassandra.dao.Chess_clubDAO;
import cassandra.entity.chess_clubs;
import cassandra.util.MyCassandraTemplate;

@Repository
public class Chess_clubDAOimpl implements Chess_clubDAO {
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public chess_clubs createchess_clubs(chess_clubs chess_clubs) {
		chess_clubs.setId(UUID.randomUUID());
		return myCassandraTemplate.create(chess_clubs);
	}

	@Override
	public chess_clubs getchess_clubs(int id) {
		return myCassandraTemplate.findById(id, chess_clubs.class);
	}

	@Override
	public chess_clubs updatechess_clubs(chess_clubs chess_clubs) {
		return myCassandraTemplate.update(chess_clubs, chess_clubs.class);
	}

	@Override
	public void deletechess_clubs(int id) {
		myCassandraTemplate.deleteById(id, chess_clubs.class);

	}

	@Override
	public List<chess_clubs> getAllchess_clubs() {
		return myCassandraTemplate.findAll(chess_clubs.class);
	}

}
