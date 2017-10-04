package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("Ref_result_codes")
public class Ref_result_codes {
	@PrimaryKey("resultCode")
	private Integer resultCode;
	@Column("resultDescription")
	private String resultDescription;
	public Integer getResultCode() {
		return resultCode;
	}
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDescription() {
		return resultDescription;
	}
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
	@Override
	public String toString() {
		return "Ref_result_codes [resultCode=" + resultCode + ", resultDescription=" + resultDescription + "]";
	}
	public Ref_result_codes(Integer resultCode, String resultDescription) {
		super();
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
	}
	public Ref_result_codes() {
		super();
	}
	
	
}
