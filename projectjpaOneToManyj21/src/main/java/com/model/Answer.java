package com.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Answer {
	
	@Id
	private int answerId;
	private String ans;
	
	
	public Answer() {
		super();
	}

	

	public Answer(int answerId, String ans) {
		super();
		this.answerId = answerId;
		this.ans = ans;
	}



	public int getAnswerId() {
		return answerId;
	}


	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}


	public String getAns() {
		return ans;
	}


	public void setAns(String ans) {
		this.ans = ans;
	}

	

	

}
