package com.alpha.rest_api.Services;


import com.alpha.rest_api.Repository.StudentsRepository;
import com.alpha.rest_api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {
    @Autowired
     private StudentsRepository studentsRepository;

    public String addStudent(Student student) {
        studentsRepository.save(student);
        return "Saved student successfully";
    }

    public List<Student> getAllStudents() {
        return studentsRepository.findAll();

    }

    public void deleteStudent(String Id) {
        studentsRepository.deleteById(Id);

    }

//   public String update(Student student){
//        studentsRepository.save()
//   }

}
