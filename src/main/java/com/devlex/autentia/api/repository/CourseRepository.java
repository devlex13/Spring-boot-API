package com.devlex.autentia.api.repository;

import com.devlex.autentia.api.domain.Course;
import com.devlex.autentia.api.mapper.CourseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository {

    private CourseMapper courseMapper;

    public CourseRepository(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    public List<Course> getAllActiveCourses() {
        return courseMapper.findAll();
    }

    public Course getCourseById(int id) {
        return courseMapper.findById(id);
    }

    public void deleteCourse(int id) {
        courseMapper.deleteById(id);
    }

    public void addCourse(Course course) {
        courseMapper.save(course);
    }
}
