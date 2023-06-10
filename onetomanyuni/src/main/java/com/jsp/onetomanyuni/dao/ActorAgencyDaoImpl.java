package com.jsp.onetomanyuni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomanyuni.entity.ActorEntity;
import com.jsp.onetomanyuni.entity.AgencyEntity;

public class ActorAgencyDaoImpl implements ActorAgencyDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public ActorAgencyDaoImpl() {
		System.out.println("Invoked " + this.getClass().getSimpleName());
	}

	@Override
	public void saveData(List<ActorEntity> actorEntities, AgencyEntity agencyEntity) {
		System.out.println("Invoked saveData");
		if (!actorEntities.isEmpty() && agencyEntity != null) {
			boolean check = true;
			if (check == true) {
				for (ActorEntity actorEntity : actorEntities) {
					transaction.begin();
					entityManager.persist(actorEntity);
					transaction.commit();
				}
				transaction.begin();
				entityManager.persist(agencyEntity);
				transaction.commit();
				check = false;
				System.out.println("Data saved");
			} else {
				System.out.println("Data not saved");
			}
		} else {
			System.out.println("Data is empty");
		}
	}

	@Override
	public List<ActorEntity> fetchAllActorDetails() {
		System.out.println("Invoked fetchAllActorDetails");
		List<ActorEntity> list=entityManager.createQuery("select data from ActorEntity data").getResultList();
		if(!list.isEmpty()) {
			return list;
		}else {
			return null;
		}	
	}

	@Override
	public List<AgencyEntity> fetchAllAgencyDetails() {
		System.out.println("Invoked fetchAllActorDetails");
		List<AgencyEntity> list=entityManager.createQuery("select data from AgencyEntity data").getResultList();
		if(!list.isEmpty()) {
			return list;
		}else {
			return null;
		}
	}

	@Override
	public ActorEntity fetchActorDetailsByName(String name) {
		System.out.println("Invoked fetchActorDetailsByName");
		List<ActorEntity> list=entityManager.createQuery("select data from ActorEntity data where data.actor=?1").setParameter(1, name).getResultList();
		if(!list.isEmpty()) {
			return list.get(0);
		}else {
			return null;
		}	
	}

	@Override
	public AgencyEntity fetchAgencyDetailsByName(String name) {
		System.out.println("Invoked fetchAgencyDetailsByName");
		AgencyEntity agencyEntity= entityManager.find(AgencyEntity.class, name);
		if(agencyEntity!=null) {
			return agencyEntity;
		}else {
			return null;
		}		
	}

	@Override
	public String updateActorDataById(int id, ActorEntity entity) {
		System.out.println("Invoked updateActorDataById");
		boolean check=true;
		if(check==true) {
			transaction.begin();
			ActorEntity actorEntity=entityManager.find(ActorEntity.class, id);
			actorEntity.setActorId(id);
			actorEntity.setActor(entity.getActor());
			actorEntity.setPhone(entity.getPhone());
			entityManager.merge(actorEntity);
			transaction.commit();
			check=false;
			return "Data updated successfully";
		}else {
			return "Data is not updated";
		}	
	}

	@Override
	public String updateAgencyDataByName(String name, AgencyEntity agencyEntity) {
		System.out.println("Invoked updateAgencyDataByName");
		boolean check=true;
		if(check==true) {
			transaction.begin();
			AgencyEntity entity=entityManager.find(AgencyEntity.class, name);
			entity.setAgency(name);
			entity.setPhone(agencyEntity.getPhone());
			entity.setPlace(agencyEntity.getPlace());
			entityManager.merge(entity);
			transaction.commit();
			check=false;
			return "Data updated successfully";
		}	else {
			return "Data is not updated";
		}		
	}

	@Override
	public boolean deleteAgencyDataByName(String name) {
		System.out.println("Invoked deleteAgencyDataByName");
		if(name!=null) {
			transaction.begin();
			AgencyEntity agencyEntity=entityManager.find(AgencyEntity.class, name);
			entityManager.remove(agencyEntity);
			transaction.commit();
			return true;
		}else {
			return false;
		}
	}

}
