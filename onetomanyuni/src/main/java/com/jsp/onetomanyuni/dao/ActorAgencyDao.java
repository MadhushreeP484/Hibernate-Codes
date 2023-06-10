package com.jsp.onetomanyuni.dao;

import java.util.List;

import com.jsp.onetomanyuni.entity.ActorEntity;
import com.jsp.onetomanyuni.entity.AgencyEntity;

public interface ActorAgencyDao {
	
	public void saveData(List<ActorEntity> actorEntities,AgencyEntity agencyEntity);
	
	public List<ActorEntity> fetchAllActorDetails();
	
	public List<AgencyEntity> fetchAllAgencyDetails();
	
	public ActorEntity fetchActorDetailsByName(String name);
	
	public AgencyEntity fetchAgencyDetailsByName(String name);
	
	public String updateActorDataById(int id, ActorEntity actorEntity);
	
	public String updateAgencyDataByName(String name, AgencyEntity agencyEntity);
	
	public boolean deleteAgencyDataByName(String name);

}
