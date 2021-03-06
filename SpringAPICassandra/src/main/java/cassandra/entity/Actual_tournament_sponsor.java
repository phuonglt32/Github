package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.core.LocalDate;

@Table("actual_tournament_sponsor")
public class Actual_tournament_sponsor {
	
	@PrimaryKey
	private Actual_tournament_sposorPK pk;
	
	@Column("sponsor_name")
	private String sponsor_name;
	
	@Column("sponsor_phone")
	private String sponsor_phone;
	
	@Column("organizerid")
	private int organizerid;
	
	@Column("tournament_details")
	private String tournament_details;
	
	@Column("tournament_end_date")
	private LocalDate tournament_end_date;
	
	@Column("tournament_name")
	private String tournament_name;
	
	@Column("tournament_start_date")
	private LocalDate tournament_start_date;
	

	public int getOrganizerid() {
		return organizerid;
	}
	public void setOrganizerid(int organizerid) {
		this.organizerid = organizerid;
	}
	public String getSponsor_name() {
		return sponsor_name;
	}
	public void setSponsor_name(String sponsor_name) {
		this.sponsor_name = sponsor_name;
	}
	public String getSponsor_phone() {
		return sponsor_phone;
	}
	public void setSponsor_phone(String sponsor_phone) {
		this.sponsor_phone = sponsor_phone;
	}
	public String getTournament_details() {
		return tournament_details;
	}
	public void setTournament_details(String tournament_details) {
		this.tournament_details = tournament_details;
	}
	public LocalDate getTournament_end_date() {
		return tournament_end_date;
	}
	public void setTournament_end_date(LocalDate tournament_end_date) {
		this.tournament_end_date = tournament_end_date;
	}
	public String getTournament_name() {
		return tournament_name;
	}
	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}
	public LocalDate getTournament_start_date() {
		return tournament_start_date;
	}
	public void setTournament_start_date(LocalDate tournament_start_date) {
		this.tournament_start_date = tournament_start_date;
	}
	
	
	public Actual_tournament_sposorPK getPk() {
		return pk;
	}
	public void setPk(Actual_tournament_sposorPK pk) {
		this.pk = pk;
	}
	
	public Actual_tournament_sponsor(Actual_tournament_sposorPK pk, String sponsor_name, String sponsor_phone,
			String tournament_details, LocalDate tournament_end_date, String tournament_name,
			LocalDate tournament_start_date,int organizerid) {
		super();
		this.pk = pk;
		this.sponsor_name = sponsor_name;
		this.sponsor_phone = sponsor_phone;
		this.tournament_details = tournament_details;
		this.tournament_end_date = tournament_end_date;
		this.tournament_name = tournament_name;
		this.tournament_start_date = tournament_start_date;
		this.organizerid = organizerid;
	}
	public Actual_tournament_sponsor() {
		super();
	}
	@Override
	public String toString() {
		return "Actual_tournament_sponsor [pk=" + pk + ", sponsor_name=" + sponsor_name + ", sponsor_phone="
				+ sponsor_phone + ", organizerid=" + organizerid + ", tournament_details=" + tournament_details
				+ ", tournament_end_date=" + tournament_end_date + ", tournament_name=" + tournament_name
				+ ", tournament_start_date=" + tournament_start_date + "]";
	}
	
	
	
	
	
	
}
