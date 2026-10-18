
package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.operations.DaoOperationImpl;
import com.pojo.CandidateInfo;

@Service
public class CandidateService {
	@Autowired
	private DaoOperationImpl impl;
	
	public int addCandidate(CandidateInfo c) {
		return impl.add(c);		
	}
	
	public int updateCandidate(CandidateInfo c) {
		return impl.update(c);		
	}

	public int deleteCandidate(int candidateId) {
		return impl.delete(candidateId);		
	}
	
	public CandidateInfo selectOneCandidate(int candidateId) {
		return impl.select(candidateId);		
	}
	
	
	public List<CandidateInfo> selectAllCandidate() {
		return impl.selectAll();		
	}

}
