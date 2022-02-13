package com.cg.OPN.entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Tutorial {
	
	private String TutorialName;
	private int TutorialId;
	private String TutorialPrize;
	private String TutorialRating;
	private String TutorialReview;
	private int StockAvailable;
	
	
	public String getTutorialName() {
		return TutorialName;
	}
	public void setTutorialName(String tutorialName) {
		TutorialName = tutorialName;
	}
	public int getTutorialId() {
		return TutorialId;
	}
	public void setTutorialId(int tutorialId) {
		TutorialId = tutorialId;
	}
	public String getTutorialPrize() {
		return TutorialPrize;
	}
	public void setTutorialPrize(String tutorialPrize) {
		TutorialPrize = tutorialPrize;
	}
	public String getTutorialRating() {
		return TutorialRating;
	}
	public void setTutorialRating(String tutorialRating) {
		TutorialRating = tutorialRating;
	}
	public String getTutorialReview() {
		return TutorialReview;
	}
	public void setTutorialReview(String tutorialReview) {
		TutorialReview = tutorialReview;
	}
	public int getStockAvailable() {
		return StockAvailable;
	}
	public void setStockAvailable(int stockAvailable) {
		StockAvailable = stockAvailable;
	}
	@Override
	public String toString() {
		return "Tutorial [TutorialName=" + TutorialName + ", TutorialId=" + TutorialId + ", TutorialPrize="
				+ TutorialPrize + ", TutorialRating=" + TutorialRating + ", TutorialReview=" + TutorialReview
				+ ", StockAvailable=" + StockAvailable + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(StockAvailable, TutorialId, TutorialName, TutorialPrize, TutorialRating, TutorialReview);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tutorial other = (Tutorial) obj;
		return StockAvailable == other.StockAvailable && TutorialId == other.TutorialId
				&& Objects.equals(TutorialName, other.TutorialName)
				&& Objects.equals(TutorialPrize, other.TutorialPrize)
				&& Objects.equals(TutorialRating, other.TutorialRating)
				&& Objects.equals(TutorialReview, other.TutorialReview);
	}

}
