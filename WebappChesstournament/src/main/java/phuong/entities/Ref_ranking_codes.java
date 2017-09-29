package phuong.entities;

public class Ref_ranking_codes {
	private Integer rankingCode;
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
