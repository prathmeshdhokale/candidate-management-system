package com.pojo;



import org.springframework.stereotype.Component;

@Component
public class CandidateInfo {
	private Integer candidateId;
	private String fullname;
	private String email;
	private String phone;
	private String skills;
	private Double experienceYears;
	public CandidateInfo(Integer candidateId, String fullname, String email, String phone, String skills,
			Double experienceYears) {
		super();
		this.candidateId = candidateId;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.experienceYears = experienceYears;
	}
	public CandidateInfo() {
		super();
	}
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public Double getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(Double experienceYears) {
		this.experienceYears = experienceYears;
	}
	@Override
	public String toString() {
		return "CandidateInfo [candidateId=" + candidateId + ", fullname=" + fullname + ", email=" + email + ", phone="
				+ phone + ", skills=" + skills + ", experienceYears=" + experienceYears + "]";
	}
	
	
	
	

}
