package br.com.rupay.rupay.api.restControllers;

import br.com.rupay.rupay.domain.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;
}
