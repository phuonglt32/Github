package cassandra.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("ref_ranking_codes")
public class Ref_ranking_codes {
	
	@PrimaryKey("rankingCode")
	private Integer rankingCode;
	@Column("rankingDescription")
	private String rankingDescription;
	public Integer getRankingCode() {
		return rankingCode;
	}
	public void setRankingCode(Integer rankingCode) {
		this.rankingCode = rankingCode;
	}
	public String getRankingDescription() {
		return rankingDescription;
	}
	public void setRankingDescription(String rankingDescription) {
		this.rankingDescription = rankingDescription;
	}
	@Override
	public String toString() {
		return "Ref_ranking_codes [rankingCode=" + rankingCode + ", rankingDescription=" + rankingDescription + "]";
	}
	public Ref_ranking_codes(Integer rankingCode, String rankingDescription) {
		super();
		this.rankingCode = rankingCode;
		this.rankingDescription = rankingDescription;
	}
	public Ref_ranking_codes() {
		super();
	}
	
}
