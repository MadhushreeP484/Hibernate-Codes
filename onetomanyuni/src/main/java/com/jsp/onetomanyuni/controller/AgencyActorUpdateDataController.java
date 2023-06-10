package com.jsp.onetomanyuni.controller;

import com.jsp.onetomanyuni.dao.ActorAgencyDao;
import com.jsp.onetomanyuni.dao.ActorAgencyDaoImpl;
import com.jsp.onetomanyuni.entity.ActorEntity;
import com.jsp.onetomanyuni.entity.AgencyEntity;

public class AgencyActorUpdateDataController {
	
	public static void main(String[] args) {
		ActorAgencyDao dao= new ActorAgencyDaoImpl();
		
		ActorEntity actorEntity= new ActorEntity("Dew", 7654321098l);
		//System.out.println(dao.updateActorDataById(1402, actorEntity));
		
		AgencyEntity agencyEntity= new AgencyEntity("GMMTV", "Thailand", 9012345678l);
		System.out.println(dao.updateAgencyDataByName("GMMTV", agencyEntity));
	}

}
