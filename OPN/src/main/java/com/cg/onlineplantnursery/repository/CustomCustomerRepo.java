package com.cg.onlineplantnursery.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursery.entity.Tutorial;

@Repository
public interface CustomCustomerRepo {
	public List<Tutorial> getTutorialbyPrize(int range1,int range2);
	public List<Tutorial> getTutorialbyRating(int range1,int range2);

}
