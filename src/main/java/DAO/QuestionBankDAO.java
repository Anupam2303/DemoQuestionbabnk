package DAO;

import Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.QuestionBankRespository;

import java.util.List;

/*AnupamRai*/

@Repository
public class QuestionBankDAO {
    @Autowired
    private QuestionBankRespository questionBankRespository;

    public void batchStore(List<Question> questionList){
         questionBankRespository.saveAll(questionList);
    }

    public List<Question> getQuestion() {
        return questionBankRespository.findAll();
    }
}
