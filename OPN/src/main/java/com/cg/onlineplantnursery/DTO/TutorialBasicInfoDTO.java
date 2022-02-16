package com.cg.onlineplantnursery.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class TutorialBasicInfoDTO {
	private String tutorialName;
	private int tutorialId;
	
	public String getTutorialName() {
		return tutorialName;
	}
	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}
	public int getTutorialId() {
		return tutorialId;
	}
	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}

}
