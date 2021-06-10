package com.alpha.rest_api.model;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;




@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Document(collection="students")

@Data
public class Student {
    @Id
    private String Id;

    @NotNull
    @Size(min=2, message ="Name must be at least more than 2 characters")
    private String firstName;

    @NotNull
    @Size(min=2, message ="Name must be at least more than 2 characters")
    private String lastName;

    private float gpa;
    private String email;
    private String phoneNumber;

    @Size(min=1, message ="You must have at least one course")
    private List<String> courseList;
}

