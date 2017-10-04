package cassandra.entity;

import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;


@Table("tournament")
public class Tournament {
	@PrimaryKey("tournamentId")
	private int tournamentId;
	@PrimaryKey("organizerId")
	private int organizerId;
	@Column("tournamentStartDate")
	private String tournamentStartDate;
	@Column("tournamtentEndDate")
	private String tournamtentEndDate;
	@Column("tournamentName")
	private String tournamentName;
	@Column("tournamentDetails")
	private String tournamentDetails;
	
	
	public String getTournamentStartDate() {
		return tournamentStartDate;
	}
	public void setTournamentStartDate(String tournamentStartDate) {
		this.tournamentStartDate = tournamentStartDate;
	}
	public String getTournamtentEndDate() {
		return tournamtentEndDate;
	}
	public void setTournamtentEndDate(String tournamtentEndDate) {
		this.tournamtentEndDate = tournamtentEndDate;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public String getTournamentDetails() {
		return tournamentDetails;
	}
	public void setTournamentDetails(String tournamentDetails) {
		this.tournamentDetails = tournamentDetails;
	}
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public int getOrganizerId() {
		return organizerId;
	}
	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}
	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", organizerId=" + organizerId + "]";
	}
	public Tournament( int organizerId, String tournamentStartDate, String tournamtentEndDate,
			String tournamentName, String tournamentDetails) {
		this.organizerId = organizerId;
		this.tournamentStartDate = tournamentStartDate;
		this.tournamtentEndDate = tournamtentEndDate;
		this.tournamentName = tournamentName;
		this.tournamentDetails = tournamentDetails;
	}
	public Tournament() {
		super();
	}
	
}
