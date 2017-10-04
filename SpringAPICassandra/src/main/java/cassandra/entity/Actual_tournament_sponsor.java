package cassandra.entity;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("actual_tournament_sponsor")
public class Actual_tournament_sponsor {
	
	@PrimaryKey("tournamentid")
	private int tournamentid;
	
	@PrimaryKey("sponsorid")
	private int sponsorid;
	
	
	public int getTournamentid() {
		return tournamentid;
	}
	public void setTournamentid(int tournamentid) {
		this.tournamentid = tournamentid;
	}
	public int getSponsorid() {
		return sponsorid;
	}
	public void setSponsorid(int sponsorid) {
		this.sponsorid = sponsorid;
	}
	public Actual_tournament_sponsor(int tournamentid, int sponsorid) {
		super();
		this.tournamentid = tournamentid;
		this.sponsorid = sponsorid;
	}
	public Actual_tournament_sponsor() {
		super();
	}
	@Override
	public String toString() {
		return "Actual_tournament_sponsor [tournamentid=" + tournamentid + ", sponsorid=" + sponsorid + "]";
	}
	
}
