package Service;

/*
 *Anupam*
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import DAO.QuestionBankDAO;
import Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * Author : AnupamRai
 */


@Service
public class UploadService {

    @Autowired
    private QuestionBankDAO questionBankDAO;

    public List<Question> uploadFile(MultipartFile multipartFile) throws IOException {

        File file = convertMultiPartToFile(multipartFile);

        List<Question> mandatoryMissedList = new ArrayList<Question>();

        try (Reader reader = new FileReader(file);) {
            @SuppressWarnings("unchecked")
            CsvToBean<Question> csvToBean = new CsvToBeanBuilder<Question>(reader).withType(Question.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            List<Question> questionList = csvToBean.parse();

            Iterator<Question> questionListClone = questionList.iterator();

            while (questionListClone.hasNext()) {

                Question question = questionListClone.next();

                if (question.getQuestion() == null || question.getQuestion().isEmpty()
                        || question.getJobProfile1() == null || question.getJobProfile1().isEmpty()
                        ||question.getSkillSet() == null || question.getSkillSet().isEmpty()
                        || question.getAnswer() == null || question.getAnswer().isEmpty()) {
                    mandatoryMissedList.add(question);
                    questionListClone.remove();
                }
            }

            questionBankDAO.batchStore(questionList);
        }
        return mandatoryMissedList;
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    public List<Question> getStudents() {
        return questionBankDAO.getQuestion();
    }
}