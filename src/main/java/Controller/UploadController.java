package Controller;

import Model.Question;
import Service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/*AnupamRai*/

@RestController
@RequestMapping("/Model/Question")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @Autowired
    UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public List<Question> uploadFile(@RequestPart(value = "file") MultipartFile multiPartFile) throws IOException {
        return uploadService.uploadFile(multiPartFile);
    }

    @RequestMapping
    public List<Question> getStudents(){
        return uploadService.getStudents();
    }

}
