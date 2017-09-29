package phuong.entities;

public class Chess_club {
	private Integer clubId;
	private String clubName;
	private String clubAddress;
	private Integer organizerId;
	
	public Chess_club(String clubName, String clubAddress, Integer organizerId) {
		this.clubName = clubName;
		this.clubAddress = clubAddress;
		this.organizerId = organizerId;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubAddress() {
		return clubAddress;
	}

	public void setClubAddress(String clubAddress) {
		this.clubAddress = clubAddress;
	}

	public Integer getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(Integer organizerId) {
		this.organizerId = organizerId;
	}

	@Override
	public String toString() {
		return "Chess_club [clubId=" + clubId + ", clubName=" + clubName + ", clubAddress=" + clubAddress
				+ ", organizerId=" + organizerId + "]";
	}

	public Chess_club() {
	}
	
	
	
	
}
