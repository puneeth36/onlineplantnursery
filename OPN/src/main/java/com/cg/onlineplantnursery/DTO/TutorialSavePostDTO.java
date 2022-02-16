package com.cg.onlineplantnursery.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

public class TutorialSavePostDTO {
	private String tutorialName;
	@Id
	@SequenceGenerator(name="myTutoriallogic",initialValue=200,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="myTutoriallogic")
	private int tutorialId;
	private int tutorialPrize;
	@Size(min = 1, max = 5)
	private int tutorialRating;
	private String tutorialReview;
	private int stockAvailable;
	
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
	public int getTutorialPrize() {
		return tutorialPrize;
	}
	public void setTutorialPrize(int tutorialPrize) {
		this.tutorialPrize = tutorialPrize;
	}
	public int getTutorialRating() {
		return tutorialRating;
	}
	public void setTutorialRating(int tutorialRating) {
		this.tutorialRating = tutorialRating;
	}
	public String getTutorialReview() {
		return tutorialReview;
	}
	public void setTutorialReview(String tutorialReview) {
		this.tutorialReview = tutorialReview;
	}
	public int getStockAvailable() {
		return stockAvailable;
	}
	public void setStockAvailable(int stockAvailable) {
		this.stockAvailable = stockAvailable;
	}

}
