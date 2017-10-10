package cassandra.entity;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class Actual_tournament_sposorPK {
	
	
	@PrimaryKeyColumn(name = "tournamentid", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private int tournamentid;

	@PrimaryKeyColumn(name = "sponsorid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
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

	public Actual_tournament_sposorPK() {
		super();
	}

	public Actual_tournament_sposorPK(int tournamentid, int sponsorid) {
		super();
		this.tournamentid = tournamentid;
		this.sponsorid = sponsorid;
	}

	@Override
	public String toString() {
		return "Actual_tournament_sposorPK [tournamentid=" + tournamentid + ", sponsorid=" + sponsorid + "]";
	}
	
	
}
