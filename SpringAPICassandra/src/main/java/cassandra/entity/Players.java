package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("players")
public class Players {
	
	@PrimaryKey("playerId")
	private Integer playerId;
	@Column("name")
	private String name;
	@Column("address")
	private String address;
	@Column("phoneNumber")
	private String phoneNumber;
	@Column("emailAddress")
	private String emailAddress;
	@Column("club_id")
	private int club_id;
	@Column("ranking_code")
	private int ranking_code;
	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", name=" + name + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", emailAddress=" + emailAddress + ", club_id=" + club_id + ", ranking_code="
				+ ranking_code + "]";
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	public int getRanking_code() {
		return ranking_code;
	}
	public void setRanking_code(int ranking_code) {
		this.ranking_code = ranking_code;
	}
	public Players(Integer playerId, String name, String address, String phoneNumber, String emailAddress, int club_id,
			int ranking_code) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.club_id = club_id;
		this.ranking_code = ranking_code;
	}
	public Players() {
		super();
	}
	
	
}
