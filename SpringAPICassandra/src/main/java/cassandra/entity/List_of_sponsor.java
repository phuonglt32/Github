package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("list_of_sponsor")
public class List_of_sponsor {
	
	@PrimaryKey("sponsorId")
	private Integer sponsorId;
	
	@Column("sponsorName")
	private String sponsorName;
	
	@Column("sponsorPhone")
	private String sponsorPhone;
	
	public Integer getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(Integer sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public String getSponsorPhone() {
		return sponsorPhone;
	}
	public void setSponsorPhone(String sponsorPhone) {
		this.sponsorPhone = sponsorPhone;
	}
	@Override
	public String toString() {
		return "List_of_sponsor [sponsorId=" + sponsorId + ", sponsorName=" + sponsorName + ", sponsorPhone="
				+ sponsorPhone + "]";
	}
	public List_of_sponsor() {
		super();
	}
	public List_of_sponsor(Integer sponsorId, String sponsorName, String sponsorPhone) {
	
		this.sponsorName = sponsorName;
		this.sponsorPhone = sponsorPhone;
	}
	
	
}
