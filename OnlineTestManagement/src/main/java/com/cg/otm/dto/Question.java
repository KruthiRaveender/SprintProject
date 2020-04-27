package com.cg.otm.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Question 
{
	@Id	
	@Column(name="q_id")
	int QuestionId;
	@Column(name="q_content")
	String QuestionContent;
	@Column(name="q_option1")
	String Option1;
    @Column(name="q_option2")
	String Option2;
	@Column(name="q_option3")
	String Option3;
	@Column(name="q_marks")
	int  Marks;
	@Column(name="ans_opt")
	int AnswerOption;
	public Question() {}
	public Question(int questionId, String questionContent, String option1, String option2, String option3, int marks,
			int answerOption) {
		super();
		this.QuestionId = questionId;
		this.QuestionContent = questionContent;
		this.Option1 = option1;
		this.Option2 = option2;
		this.Option3 = option3;
		this.Marks = marks;
		this.AnswerOption = answerOption;
	}
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public String getQuestionContent() {
		return QuestionContent;
	}
	public void setQuestionContent(String questionContent) {
		QuestionContent = questionContent;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public int getAnswerOption() {
		return AnswerOption;
	}
	public void setAnswerOption(int answerOption) {
		AnswerOption = answerOption;
	}
}
