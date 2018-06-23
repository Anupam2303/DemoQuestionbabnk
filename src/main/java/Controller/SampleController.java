package Controller;

/*AnupamRai*/

import Model.QuestionBank;
import Service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/questions")
public class SampleController {

    @Autowired
    private QuestionBankService questionBankService;

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces =MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public QuestionBank getQuestions(@RequestParam String questionId) {
        return questionBankService.getQuestion(questionId);
    }
}
