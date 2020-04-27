package com.cg.otm.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otm.dto.Question;
import com.cg.otm.service.QuestionService;

@RestController
public class QuestionController 
{
	@Autowired
	QuestionService questionService;
	public void setQuestionService(QuestionService questionService)
	{
		this.questionService=questionService;
	}
	
   @GetMapping("/getQuestions")
   public List<Question> getQuestions()
   {
	   return questionService.getQuestions();
   }

   @PostMapping(value="/addQuestion",consumes="application/json")
   public ResponseEntity<String> insertQuestion(@RequestBody()Question question)
   {
	   String message="Question inserted successfully";
	   if(questionService.insertQuestion(question)==null)
		   message="Question insertion failed";
	   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
   }
   
   @PutMapping(value="/updateQuestion",consumes="application/json")
   public String updateQuestion(@RequestBody()Question question)
   {
	   String message=questionService.updateQuestion(question);
	   return message;
   }
}
  







