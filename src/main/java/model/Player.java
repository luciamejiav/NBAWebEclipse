package model;

public class Player {
	private String id;
	private String firstName;
	private String lastName;
	private String team;
	private String position;
	private String dateOfBirth;
	private String height;
	private String weight;
	private String jerseyNumber;
	private String age;
	private String headShotUrl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeadShotUrl() {
		return headShotUrl;
	}
	public void setHeadShotUrl(String headShotUrl) {
		this.headShotUrl = headShotUrl;
	}
	public String getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(String dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	
	private String dateLastUpdated;
	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", team=" + team
				+ ", position=" + position + ", dateOfBirth=" + dateOfBirth + ", height=" + height + ", weight="
				+ weight + ", jerseyNumber=" + jerseyNumber + ", age=" + age + ", headShotUrl=" + headShotUrl
				+ ", dateLastUpdated=" + dateLastUpdated + "]";
	}
	
	
}
