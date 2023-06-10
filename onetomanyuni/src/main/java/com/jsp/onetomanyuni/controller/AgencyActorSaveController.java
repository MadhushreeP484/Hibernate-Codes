package com.jsp.onetomanyuni.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.onetomanyuni.dao.ActorAgencyDao;
import com.jsp.onetomanyuni.dao.ActorAgencyDaoImpl;
import com.jsp.onetomanyuni.entity.ActorEntity;
import com.jsp.onetomanyuni.entity.AgencyEntity;

public class AgencyActorSaveController {

	public static void main(String[] args) {
		
		ActorAgencyDao dao= new ActorAgencyDaoImpl();
		List<ActorEntity> list = new ArrayList();
		/*ActorEntity actorEntity1 = new ActorEntity("Bright", 8765432109l);
		ActorEntity actorEntity2 = new ActorEntity("Win", 8765432190l);
		ActorEntity actorEntity3 = new ActorEntity("Dew", 8765432108l);
		ActorEntity actorEntity4 = new ActorEntity("New", 8765432180l);

		list.add(actorEntity1);
		list.add(actorEntity2);
		list.add(actorEntity3);
		list.add(actorEntity4);
		AgencyEntity agencyEntity = new AgencyEntity("GMMTV", "US", 9012345678l);*/
		
		ActorEntity actorEntity1= new ActorEntity("Shin eun", 4567890123l);
		ActorEntity actorEntity2= new ActorEntity("Jun ho", 5432167890l);
		ActorEntity actorEntity3= new ActorEntity("Jia", 6543217890l);
		ActorEntity actorEntity4= new ActorEntity("Jay", 7654321890l);
		list.add(actorEntity1);
		list.add(actorEntity2);
		list.add(actorEntity3);
		list.add(actorEntity4);
		AgencyEntity agencyEntity=new AgencyEntity("JYP Entertainment", "Korea", 5577448420l);
		
		agencyEntity.setActorEntity(list);

		dao.saveData(list, agencyEntity);
	}

}
