package com.cg.onlineplantnursery.util;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cg.onlineplantnursery.DTO.TutorialBasicInfoDTO;
import com.cg.onlineplantnursery.DTO.TutorialSavePostDTO;
import com.cg.onlineplantnursery.entity.Tutorial;

@Component
public class TutorialDTOConversion {
	
	@Transactional
	public TutorialBasicInfoDTO getTutorialBasiInfoDTO(Tutorial t) {
		TutorialBasicInfoDTO dto = new TutorialBasicInfoDTO();
		dto.setTutorialId(t.getTutorialId());
		dto.setTutorialName(t.getTutorialName());
		return dto;
		
	}
	@Transactional
	public Tutorial getTutorialSavePostDTO(TutorialSavePostDTO dto) {
		Tutorial t = new  Tutorial();
		t.setTutorialId(dto.getTutorialId());
		t.setTutorialName(dto.getTutorialName());
		t.setTutorialRating(dto.getTutorialRating());
		t.setTutorialReview(dto.getTutorialReview());
		t.setTutorialPrize(dto.getTutorialPrize());
		return t;
		
	}

}
