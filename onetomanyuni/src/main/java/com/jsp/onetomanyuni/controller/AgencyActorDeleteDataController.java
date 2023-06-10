package com.jsp.onetomanyuni.controller;

import com.jsp.onetomanyuni.dao.ActorAgencyDao;
import com.jsp.onetomanyuni.dao.ActorAgencyDaoImpl;

public class AgencyActorDeleteDataController {
	
	public static void main(String[] args) {
		
		ActorAgencyDao dao= new ActorAgencyDaoImpl();
		
		System.out.println(dao.deleteAgencyDataByName("JYP Entertainment"));

	}

}
