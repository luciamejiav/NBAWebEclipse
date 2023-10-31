package model;

public class Team {
	private String id;
	private String name;
	private String conference;
	private String record;
	private String teamLogoUrl;
	private String dateLastUpdated;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getConference() {
		return conference;
	}
	public String getRecord() {
		return record;
	}
	public String getTeamLogoUrl() {
		return teamLogoUrl;
	}
	public String getDateLastUpdated() {
		return dateLastUpdated;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", conference=" + conference + ", record=" + record
				+ ", teamLogoUrl=" + teamLogoUrl + ", dateLastUpdated=" + dateLastUpdated + "]";
	}
	
	
}
