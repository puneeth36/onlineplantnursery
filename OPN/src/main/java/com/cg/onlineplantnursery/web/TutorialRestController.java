package com.cg.onlineplantnursery.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineplantnursery.entity.Tutorial;
import com.cg.onlineplantnursery.service.ITutorialService;

@RestController
@RequestMapping("/policy")
public class TutorialRestController {
	@Autowired
	ITutorialService tutorialService;
	
	@PostMapping("/")
	public ResponseEntity<Boolean> insertPolicy(@RequestBody Tutorial tutorial)
	{
		boolean isInserted = false;
		
		isInserted = tutorialService.createTutorial(tutorial);
		
				
		return new ResponseEntity<Boolean>(isInserted,
				 isInserted==true?HttpStatus.OK:HttpStatus.EXPECTATION_FAILED);
	}
	
	@GetMapping("/{searchTutorialId}")
	public ResponseEntity<Tutorial> getPolicy(@PathVariable int searchTutorialId)
	{
		Tutorial p =  tutorialService.getTutorialById(searchTutorialId);
		return new ResponseEntity<Tutorial>(p,HttpStatus.OK);
	
	}
	
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials()
	{
		List<Tutorial> list = tutorialService.getAllTutorials();
		return new ResponseEntity<List<Tutorial>>(list!=null?list:null,HttpStatus.OK);
	
	}
	
	

}
