package cassandra.entity;

import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.core.LocalDate;


@Table("tournament")
public class Tournament {
	@PrimaryKey("tournamentId")
	private int tournamentId;
	private int organizerId;
	
	@Column("tournamentStartDate")
	private LocalDate tournamentStartDate;
	
	@Column("tournamtentEndDate")
	private LocalDate tournamtentEndDate;
	
	@Column("tournamentName")
	private String tournamentName;
	
	@Column("tournamentDetails")
	private String tournamentDetails;
	
	
	public LocalDate getTournamentStartDate() {
		return tournamentStartDate;
	}
	public void setTournamentStartDate(LocalDate tournamentStartDate) {
		this.tournamentStartDate = tournamentStartDate;
	}
	public LocalDate getTournamtentEndDate() {
		return tournamtentEndDate;
	}
	public void setTournamtentEndDate(LocalDate tournamtentEndDate) {
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
	public Tournament() {
		super();
	}
	public Tournament(int tournamentId, int organizerId, LocalDate tournamentStartDate, LocalDate tournamtentEndDate,
			String tournamentName, String tournamentDetails) {
		super();
		this.tournamentId = tournamentId;
		this.organizerId = organizerId;
		this.tournamentStartDate = tournamentStartDate;
		this.tournamtentEndDate = tournamtentEndDate;
		this.tournamentName = tournamentName;
		this.tournamentDetails = tournamentDetails;
	}
	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", organizerId=" + organizerId + ", tournamentStartDate="
				+ tournamentStartDate + ", tournamtentEndDate=" + tournamtentEndDate + ", tournamentName="
				+ tournamentName + ", tournamentDetails=" + tournamentDetails + "]";
	}
	
}
