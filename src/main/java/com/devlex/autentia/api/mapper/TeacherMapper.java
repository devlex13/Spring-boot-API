package com.devlex.autentia.api.mapper;

import com.devlex.autentia.api.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherMapper extends CrudRepository<Teacher, Integer> {
    List<Teacher> findAll();
}
