package com.devlex.autentia.api.service;

import com.devlex.autentia.api.domain.Teacher;
import com.devlex.autentia.api.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }
}
