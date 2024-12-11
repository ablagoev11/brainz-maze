package com.brainzmaze.rest.mappers;

import com.brainzmaze.rest.dtos.TeacherDto;
import com.brainzmaze.rest.models.Teacher;

public class TeacherMapper {
    public static TeacherDto toDto(Teacher teacher) {
        TeacherDto dto = new TeacherDto();
        dto.setId(teacher.getId());
        dto.setFirstName(teacher.getFirstName());
        dto.setLastName(teacher.getLastName());
        dto.setEmail(teacher.getEmail());
        return dto;
    }

    public static Teacher toModel(TeacherDto dto) {
        Teacher teacher = new Teacher();
        teacher.setId(dto.getId());
        teacher.setFirstName(dto.getFirstName());
        teacher.setLastName(dto.getLastName());
        teacher.setEmail(dto.getEmail());
        return teacher;
    }
}
