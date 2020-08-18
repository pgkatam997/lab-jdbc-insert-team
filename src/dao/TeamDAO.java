package dao;

import java.sql.PreparedStatement;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	@SuppressWarnings("unused")
	public void createTeam(Team team) throws Exception {
		System.out.println("Create team dao");
		
		String name=team.getName();
		String coach=team.getCoach();
		String cityid=team.getCity();
		ConnectionManager cm=new ConnectionManager();
		
		String sql="Insert into TEAM(NAME,COACH,CITY)VALUES(?,?,?)";
		
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, name());
		st.setString(2, coach());
		st.setString(3, cityid);
		st.executeUpdate();
		ConnectionManager.getConnection().close();
}

	private String coach() {
		return null;
	}

	private String name() {
		return null;
	}
}
