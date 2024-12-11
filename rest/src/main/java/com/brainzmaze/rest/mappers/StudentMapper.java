package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.StudentDto;
import com.brainzmaze.rest.models.Student;

public class StudentMapper {
    public static StudentDto toDto(Student student) {
        StudentDto dto = new StudentDto();
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setId(student.getId());
        return dto;
    }
    public static Student toModel(StudentDto dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        return student;

    }
}
