package com.cg.onlineplantnursery.web;

import java.util.List;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineplantnursery.DTO.TutorialBasicInfoDTO;
import com.cg.onlineplantnursery.DTO.TutorialSavePostDTO;
import com.cg.onlineplantnursery.entity.Tutorial;
import com.cg.onlineplantnursery.service.ITutorialService;


@RestController
@RequestMapping("/tutorial")
public class TutorialRestController {
	@Autowired
	ITutorialService tutorialService;
	
	@PostMapping("/")
	public ResponseEntity<Boolean> insertTutorial(@RequestBody Tutorial tutorial)
	{
		boolean isInserted = false;
		
		isInserted = tutorialService.createTutorial(tutorial);
		
				
		return new ResponseEntity<Boolean>(isInserted,
				 isInserted==true?HttpStatus.OK:HttpStatus.EXPECTATION_FAILED);
	}
	
	@GetMapping("/gtutorial")
	public ResponseEntity<Tutorial> getTutuorial(@RequestParam int searchTutorialId)
	{
		Tutorial p =  tutorialService.getTutorialById(searchTutorialId );
		return new ResponseEntity<Tutorial>(p,HttpStatus.OK);
	
	}
	
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials()
	{
		List<Tutorial> list = tutorialService.getAllTutorials();
		return new ResponseEntity<List<Tutorial>>(list!=null?list:null,HttpStatus.OK);
	
	}
	@GetMapping("/tutorial")
	public List<Tutorial> getTutorialbyPrize(@RequestParam int range1,@RequestParam int range2) throws NoResultException{
		return tutorialService.getTutorialbyPrize(range1, range2);
	}
	@GetMapping("/tutorial/tutorial")
	public List<Tutorial> getTutorialbyRating(@RequestParam int range1,@RequestParam int range2) throws NoResultException{
		return tutorialService.getTutorialbyRating(range1, range2);
		
	}
	
	@Transactional
	@PostMapping("/stutorial")
	public ResponseEntity<TutorialBasicInfoDTO> getTutorialSavePostDTO(TutorialSavePostDTO dto) {
		TutorialBasicInfoDTO a = tutorialService.getTutorialSavePostDTO(dto);
		return new ResponseEntity<TutorialBasicInfoDTO>(a,HttpStatus.OK);
	}

	
	
	
	

}
