package com.cg.onlineplantnursery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineplantnursery.DTO.TutorialBasicInfoDTO;
import com.cg.onlineplantnursery.DTO.TutorialSavePostDTO;
import com.cg.onlineplantnursery.entity.Tutorial;

@Service
public interface ITutorialService {
	public boolean createTutorial(Tutorial tutorial);
	public Tutorial getTutorialById(int searchTutorialId);
	public List<Tutorial> getAllTutorials();
	public List<Tutorial> getTutorialbyPrize(int range1,int range2);
	public List<Tutorial> getTutorialbyRating(int range1,int range2);
	public TutorialBasicInfoDTO getTutorialSavePostDTO(TutorialSavePostDTO dto);

}
