package com.devlex.autentia.api.repository;

import com.devlex.autentia.api.domain.Teacher;
import com.devlex.autentia.api.mapper.TeacherMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherRepository {

    private TeacherMapper teacherMapper;

    public TeacherRepository(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public List<Teacher> getAllTeachers() {
        return teacherMapper.findAll();
    }
}
