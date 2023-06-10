package com.jsp.onetomanyuni.controller;

import java.util.List;

import com.jsp.onetomanyuni.dao.ActorAgencyDao;
import com.jsp.onetomanyuni.dao.ActorAgencyDaoImpl;
import com.jsp.onetomanyuni.entity.ActorEntity;
import com.jsp.onetomanyuni.entity.AgencyEntity;

public class AgencyActorFetchDataController {

	public static void main(String[] args) {

		ActorAgencyDao dao = new ActorAgencyDaoImpl();

		List<AgencyEntity> agencyEntities = dao.fetchAllAgencyDetails();
		try {
			for (AgencyEntity agencyEntity : agencyEntities) {
				System.out.println(agencyEntity);
				System.out.println(agencyEntity.getActorEntity());
			}
		} catch (Exception e) {
			System.out.println("AgencyList is empty");
		}
		System.out.println("-----------------------------------------------------------------");
		List<ActorEntity> actorEntities = dao.fetchAllActorDetails();
		try {
			for (ActorEntity actorEntity : actorEntities) {
				System.out.println(actorEntity);
			}
		} catch (Exception e) {
			System.out.println("ActorList is empty");
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println(dao.fetchActorDetailsByName("Bright"));
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println(dao.fetchAgencyDetailsByName("GMMTV"));
	}

}
