package cassandra.entity;


import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("chess_clubs")
public class chess_clubs {

	@PrimaryKey("club_id")
	private UUID id;

	@Column("club_address")
	private String address;

	@Column("club_name")
	private String name;
	

	@Column("organizer_details")
	private String organizer_details;
	
	@Column("organizer_name")
	private String organizer_name;
	
	@Column("organizer_id")
	private int organizer_id;
	
	public String getOrganizer_details() {
		return organizer_details;
	}

	public void setOrganizer_details(String organizer_details) {
		this.organizer_details = organizer_details;
	}

	public String getOrganizer_name() {
		return organizer_name;
	}

	public void setOrganizer_name(String organizer_name) {
		this.organizer_name = organizer_name;
	}

	public int getOrganizer_id() {
		return organizer_id;
	}

	public void setOrganizer_id(int organizer_id) {
		this.organizer_id = organizer_id;
	}

	public UUID getId() {
//		UUID.randomUUID();
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public chess_clubs() {
		super();
	}

	

	public chess_clubs(UUID id, String address, String name, String organizer_details, String organizer_name,
			int organizer_id) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.organizer_details = organizer_details;
		this.organizer_name = organizer_name;
		this.organizer_id = organizer_id;
	}

	@Override
	public String toString() {
		return "chess_clubs [id=" + id + ", address=" + address + ", name=" + name + ", organizer_details="
				+ organizer_details + ", organizer_name=" + organizer_name + ", organizer_id=" + organizer_id + "]";
	}

	
	
	
}
