package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("tournament_organizers")
public class Tournament_organizers {
	
	@PrimaryKey("organizerId")
	private Integer organizerId;
	@Column("clubId")
	private Integer clubId;
	@Column("organizerName")
	private String organizerName;
	@Column("organizerDetails")
	private String organizerDetails;
	public Integer getOrganizerId() {
		return organizerId;
	}
	public void setOrganizerId(Integer organizerId) {
		this.organizerId = organizerId;
	}
	public Integer getClubId() {
		return clubId;
	}
	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}
	public String getOrganizerName() {
		return organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	public String getOrganizerDetails() {
		return organizerDetails;
	}
	public void setOrganizerDetails(String organizerDetails) {
		this.organizerDetails = organizerDetails;
	}
	@Override
	public String toString() {
		return "Tournament_organizers [organizerId=" + organizerId + ", clubId=" + clubId + ", organizerName="
				+ organizerName + ", organizerDetails=" + organizerDetails + "]";
	}
	public Tournament_organizers(Integer clubId, String organizerName, String organizerDetails) {

		this.clubId = clubId;
		this.organizerName = organizerName;
		this.organizerDetails = organizerDetails;
	}
	public Tournament_organizers() {
		super();
	}
	
	
}
