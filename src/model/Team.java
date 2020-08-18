package model;
public class Team{
	private String  name;
	private String coach;
	private String city;

	public Team(String name, String coachName, City city) {
		// TODO Auto-generated constructor stub
		
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}