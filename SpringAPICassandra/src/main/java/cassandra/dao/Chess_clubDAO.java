package cassandra.dao;

import java.util.List;

import cassandra.entity.Employee;
import cassandra.entity.chess_clubs;

public interface Chess_clubDAO {
	
    public chess_clubs createchess_clubs(chess_clubs chess_clubs);
    
    public chess_clubs getchess_clubs(int id);
    
    public chess_clubs updatechess_clubs(chess_clubs chess_clubs);
    
    public void deletechess_clubs(int id);
    
    public List<chess_clubs> getAllchess_clubs();
}
