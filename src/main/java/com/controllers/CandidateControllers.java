

package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.CandidateInfo;
import com.services.CandidateService;

@RestController
@RequestMapping("/can")
public class CandidateControllers {
	
	@Autowired
	private CandidateService cs;

	@GetMapping("/greeting")
	public String greet() {
		return "Good Morning";
	}
	
	@PostMapping("/add")
	public String addCandidates(@RequestBody CandidateInfo ci ) {
		int x= cs.addCandidate(ci);
		if(x>0)
			return "Inserted Sucessfully";
		return "Inserted Not Sucessfully";
	}
	
	
	
	@PutMapping("/update/{candidateId}")
	public String updateCandidates(@PathVariable int candidateId, @RequestBody CandidateInfo ci ) {
		ci.setCandidateId(candidateId);
		int x= cs.updateCandidate(ci);
		if(x>0)
			return "Updated Sucessfully";
		return "Updated Not Sucessfully";
	}
	
	@DeleteMapping("/delete/{candidateId}")
	public String deleteCandidates(@PathVariable int candidateId) {
		int x= cs.deleteCandidate(candidateId);
		if(x>0)
			return "Deleted Sucessfully";
		return "Deleted Not Sucessfully";
	}
	
	@GetMapping("/selectone/{candidateId}")
	public CandidateInfo selectOneCandidates(@PathVariable int candidateId) {
		return cs.selectOneCandidate(candidateId);		
	}
	
	
	@GetMapping("/selectall")
	public List<CandidateInfo> selectAllCandidates() {
		return cs.selectAllCandidate();		
	}
	
}
