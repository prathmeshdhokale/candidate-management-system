
package com.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.CandidateInfo;

@Repository
public class DaoOperationImpl implements DaoOperations {

	@Autowired
	private JdbcTemplate jtemp;
	
	
	@Override
	public int add(Object obj) {
		CandidateInfo c=(CandidateInfo)obj;
		String qury="insert into candidate(fullname,email,phone,skills,experienceYears) values(?,?,?,?,?)";
		int cnt=jtemp.update(qury,c.getFullname(),c.getEmail(),c.getPhone(),c.getSkills(),c.getExperienceYears());
		return cnt;
	}

	@Override
	public int update(Object obj) {
		CandidateInfo c=(CandidateInfo)obj;
		String qury="update candidate set fullname=?,email=?,phone=?,skills=?,experienceYears=? where candidateId=?";
		int cnt=jtemp.update(qury,c.getFullname(),c.getEmail(),c.getPhone(),c.getSkills(),c.getExperienceYears(),c.getCandidateId());
		return cnt;
	}

	@Override
	public int delete(int candidateId) {
		String qury="delete from candidate where candidateId=?";
		int cnt=jtemp.update(qury,candidateId);
		return cnt;
	}

	@Override
	public CandidateInfo select(int candidateId) {
		String qury="select * from candidate where candidateId=?";
		return jtemp.queryForObject(qury, (rs,rowNum)->{
			CandidateInfo ci=new CandidateInfo();
			ci.setCandidateId(rs.getInt("candidateId"));
			ci.setFullname(rs.getString("fullname"));
			ci.setEmail(rs.getString("email"));
			ci.setPhone(rs.getString("phone"));
			ci.setSkills(rs.getString("skills"));
			ci.setExperienceYears(rs.getDouble("experienceYears"));
			
			return ci;
		},candidateId);
	}
	
	
	
	

	@Override
	public List<CandidateInfo> selectAll() {
	    String query = "SELECT * FROM candidate";

	    return jtemp.query(query, (rs, rowNum) -> {
	        CandidateInfo ci = new CandidateInfo();

	        ci.setCandidateId(rs.getInt("candidateId"));
	        ci.setFullname(rs.getString("fullname"));
	        ci.setEmail(rs.getString("email"));
	        ci.setPhone(rs.getString("phone"));
	        ci.setSkills(rs.getString("skills"));
	        ci.setExperienceYears(rs.getDouble("experienceYears"));

	        return ci;
	    });
	}

}
