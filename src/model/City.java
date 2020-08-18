package model;

public class City {
	private Long cityID;
	private String cityName;
	public City(long id, String cityName) {
		super();
		this.setCityID(id);
		this.setCityName(cityName);
	}
	public Long getCityID() {
		return cityID;
	}
	public void setCityID(long id) {
		this.cityID = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
