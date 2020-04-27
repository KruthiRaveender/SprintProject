package com.cg.otm.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.otm.dao.QuestionDAO;
import com.cg.otm.dto.Question;
@Service
public class QuestionService 
{
	@Autowired
    QuestionDAO qdao;
    public void setqdao(QuestionDAO qdao) { this.qdao=qdao;}
    @Transactional
    public Question insertQuestion(Question question)
    {
        return qdao.save(question);
    }
    @Transactional(readOnly=true)
    public List<Question> getQuestions()
    {
    	return qdao.findAll();
    }
    @Transactional
    public String updateQuestion(Question newQuestion)
    {
    	Question question= qdao.findById(newQuestion.getQuestionId()).get();
    	if(question!=null)
    	{
    	 question.setQuestionContent(newQuestion.getQuestionContent());
    	 question.setOption1(newQuestion.getOption1());
    	 question.setOption2(newQuestion.getOption2());
    	 question.setOption3(newQuestion.getOption3());
    	 question.setMarks(newQuestion.getMarks());
    	 question.setAnswerOption(newQuestion.getAnswerOption());
    	  return "Question Modified";
    	}
    	return "Update Failed";
    }
    
}
