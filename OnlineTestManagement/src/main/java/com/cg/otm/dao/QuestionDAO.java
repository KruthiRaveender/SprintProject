package com.cg.otm.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.otm.dto.Question;
@Repository
public interface QuestionDAO extends JpaRepository<Question,Integer>
{

}


