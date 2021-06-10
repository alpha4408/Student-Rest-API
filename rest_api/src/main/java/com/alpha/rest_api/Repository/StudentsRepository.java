package com.alpha.rest_api.Repository;


import com.alpha.rest_api.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepository extends MongoRepository<Student, String> {
}
