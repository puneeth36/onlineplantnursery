package com.cg.onlineplantnursery.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.onlineplantnursery.entity.Tutorial;


public class CustomCustomerRepoImpl implements CustomCustomerRepo {
	@Autowired
	EntityManager entityManager;  // as a Session in Hibernate

	@Override
	public List<Tutorial> getTutorialbyPrize(int range1, int range2) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Tutorial a where tutorialPrize between ? and ?";
		
		Query<Tutorial> query = session.createQuery(queryString);
	query.setString(1, "range1");
	query.setString(2, "range2");
	
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

	@Override
	public List<Tutorial> getTutorialbyRating(int range1, int range2) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Tutorial a where tutorialRating between ? and ?";
		
		Query<Tutorial> query = session.createQuery(queryString);
	query.setString(1, "range1");
	query.setString(2, "range2");
	
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
