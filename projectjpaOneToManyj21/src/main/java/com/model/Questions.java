package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Questions {

	@Id
	private int questionId;
	private String questionName;
	
	@OneToMany
	private List<Answer> answer;

	public Questions() {
		super();
	}

	public Questions(int questionId, String questionName, List<Answer> answer) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [questionName=" + questionName + ", answer=" + answer + "]";
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	
	
	
}
