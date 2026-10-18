
package com.operations;

import java.util.List;

import com.pojo.CandidateInfo;

public interface DaoOperations {
	
	int add(Object obj);
	int update(Object obj);
	int delete(int candidateId);
	CandidateInfo select(int candidateId);
	List<CandidateInfo> selectAll();
	
	

}
