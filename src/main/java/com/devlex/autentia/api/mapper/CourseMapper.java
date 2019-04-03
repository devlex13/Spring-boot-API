package com.devlex.autentia.api.mapper;

import com.devlex.autentia.api.domain.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CourseMapper extends CrudRepository<Course, Integer> {
    List<Course> findAll();
    Course findById(int id);
}
