package Service;
import repository.QuestionBankRespository;
import Model.QuestionBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author : AnupamRai
 */


@Service
public class QuestionBankServiceImpl implements QuestionBankService{

    @Autowired
    private QuestionBankService questionBankService;

    public QuestionBank getQuestion(String questionId) {
        return questionBankService.getQuestion(questionId);
    }
}
