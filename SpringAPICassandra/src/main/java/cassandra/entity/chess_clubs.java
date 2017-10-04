package cassandra.entity;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("chess_clubs")
public class chess_clubs {

	@PrimaryKey("id")
	private UUID id;

	@Column("club_address")
	private String address;

	@Column("club_name")
	private int name;

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

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public chess_clubs() {
		super();
	}

	public chess_clubs(UUID id, String address, int name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}

	@Override
	public String toString() {
		return "chess_clubs [id=" + id + ", address=" + address + ", name=" + name + "]";
	}
	
	
}
