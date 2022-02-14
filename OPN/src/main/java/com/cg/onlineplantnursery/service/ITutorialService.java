package com.cg.onlineplantnursery.service;

import java.util.List;

import com.cg.onlineplantnursery.entity.Tutorial;


public interface ITutorialService {
	public boolean createTutorial(Tutorial tutorial);
	public Tutorial getTutorialById(int searchTutorialId);
	public List<Tutorial> getAllTutorials();
	public List<Tutorial> getTutorialbyPrize(int range1,int range2);
	public List<Tutorial> getTutorialbyRating(int range1,int range2);

}
