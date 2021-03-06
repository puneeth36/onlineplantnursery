package com.cg.onlineplantnursery.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity
public class Tutorial {
	
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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Tutorial_Info",
			joinColumns=@JoinColumn(name="tutorialdetails"),
			inverseJoinColumns=@JoinColumn(name="customerdetails"))
	private List<Tutorial> tutorials;
	
	public Tutorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutorial(String tutorialName, int tutorialId, int tutorialPrize, @Size(min = 1, max = 5) int tutorialRating,
			String tutorialReview, int stockAvailable, List<Tutorial> tutorials) {
		super();
		this.tutorialName = tutorialName;
		this.tutorialId = tutorialId;
		this.tutorialPrize = tutorialPrize;
		this.tutorialRating = tutorialRating;
		this.tutorialReview = tutorialReview;
		this.stockAvailable = stockAvailable;
		this.tutorials = tutorials;
	}

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

	public void setTutorialRating(@Size(min = 1, max = 5) int tutorialRating) {
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

	public List<Tutorial> getTutorials() {
		return tutorials;
	}

	public void setTutorials(List<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}
	
}	
	
