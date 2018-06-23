package repository;

/**
 * Author : AnupamRai
 */


import Model.Question;
import Model.QuestionBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionBankRespository extends JpaRepository<Question, String> {

}
