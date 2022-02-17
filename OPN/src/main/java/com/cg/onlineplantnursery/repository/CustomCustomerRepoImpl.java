package com.cg.onlineplantnursery.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursery.entity.Tutorial;

@Repository
public class CustomCustomerRepoImpl implements CustomCustomerRepo {
	@Autowired
	EntityManager entityManager;  // as a Session in Hibernate

	@SuppressWarnings("deprecation")
	@Override
	public List<Tutorial> getTutorialbyPrize(int range1, int range2) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Tutorial a where  a.tutorialPrize>=:range1 and a.tutorialPrize<=:range2";
		
		@SuppressWarnings("unchecked")
		Query<Tutorial> query = session.createQuery(queryString);
	query.setInteger("range1", range1);
	query.setInteger("range2", range2);
	
		List<Tutorial>  list = (List<Tutorial>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("No Tutorials In Active With tutorialPrize Ranging From"+range1+" - "+range2+".");
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Tutorial> getTutorialbyRating(int range1, int range2) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Tutorial a where  a.tutorialRating>=:range1 and a.tutorialRating<=:range2";
		
		@SuppressWarnings("unchecked")
		Query<Tutorial> query = session.createQuery(queryString);
	query.setInteger("range1", range1);
	query.setInteger("range2", range2);
	
		List<Tutorial>  list = (List<Tutorial>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("No Tutorials In Active With Rating Ranging From"+range1+" - "+range2+".");
		}
	}

}
