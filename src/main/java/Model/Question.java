package Model;

/**
 * Author : AnupamRai
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.opencsv.bean.CsvBindByName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String questionid;
    @CsvBindByName
    private String question;
    @CsvBindByName
    private String option1;
    @CsvBindByName
    private String option2;
    @CsvBindByName
    private String option3;
    @CsvBindByName
    private String option4;
    @CsvBindByName
    private String answer;
    @CsvBindByName
    private int minExp;
    @CsvBindByName
    private int maxExp;
    @CsvBindByName
    private String jobProfile1;
    @CsvBindByName
    private String jobProfile2;
    @CsvBindByName
    private String jobProfile3;
    @CsvBindByName
    private String skillSet;
    @CsvBindByName
    private String typeQuestion;

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getMinExp() {
        return minExp;
    }

    public void setMinExp(int minExp) {
        this.minExp = minExp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public String getJobProfile1() {
        return jobProfile1;
    }

    public void setJobProfile1(String jobProfile1) {
        this.jobProfile1 = jobProfile1;
    }

    public String getJobProfile2() {
        return jobProfile2;
    }

    public void setJobProfile2(String jobProfile2) {
        this.jobProfile2 = jobProfile2;
    }

    public String getJobProfile3() {
        return jobProfile3;
    }

    public void setJobProfile3(String jobProfile3) {
        this.jobProfile3 = jobProfile3;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(String typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

}
