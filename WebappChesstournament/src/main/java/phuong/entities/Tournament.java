package phuong.entities;

import java.util.Date;

public class Tournament {
	private int tournamentId;
	private int organizerId;
	private String tournamentStartDate;
	private String tournamtentEndDate;
	private String tournamentName;
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
