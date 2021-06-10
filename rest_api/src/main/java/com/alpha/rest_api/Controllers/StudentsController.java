package com.alpha.rest_api.Controllers;


import com.alpha.rest_api.Services.StudentsService;
import com.alpha.rest_api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @PostMapping("/addStudent")
    public String saveStudent(@RequestBody Student student) {
        return studentsService.addStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getMyStudents() {
        return studentsService.getAllStudents();
    }


    //REQUIRES REVIEW data not deleting
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{Id}")
   public void deleteStudentById(@PathVariable String Id) {
        studentsService.deleteStudent(Id);
        System.out.println("ID have been deleted");

   }

}