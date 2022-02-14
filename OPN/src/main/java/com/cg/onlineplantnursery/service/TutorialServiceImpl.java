package com.cg.onlineplantnursery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.onlineplantnursery.entity.Tutorial;
import com.cg.onlineplantnursery.repository.ITutorialRepository;



public class TutorialServiceImpl implements ITutorialService {
	@Autowired
	ITutorialRepository tutorialRepository;

	@Override
	public boolean createTutorial(Tutorial tutorial) {
		Tutorial saveData =  tutorialRepository.save(tutorial);
		return saveData!=null?true:false;
	}

	@Override
	public Tutorial getTutorialById(int searchTutorialId) {
		return tutorialRepository.findById(searchTutorialId).get();
	}

	@Override
	public List<Tutorial> getAllTutorials() {
	 List<Tutorial> list = (List<Tutorial>) tutorialRepository.findAll();
	 return list;
	}

	@Override
	public List<Tutorial> getTutorialbyPrize(int range1, int range2) {
		return tutorialRepository.getTutorialbyPrize(range1, range2);
	}

	@Override
	public List<Tutorial> getTutorialbyRating(int range1, int range2) {
		
		return tutorialRepository.getTutorialbyRating(range1, range2);
	}

}
