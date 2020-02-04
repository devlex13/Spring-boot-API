package com.devlex.autentia.api.service;

import com.devlex.autentia.api.domain.Course;
import com.devlex.autentia.api.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllActiveCourses() {
        return courseRepository.getAllActiveCourses();
    }

    public Course getCourseById(int id) {
        return courseRepository.getCourseById(id);
    }

    public void deleteCourse(int id) {
        courseRepository.deleteCourse(id);
    }

    public void addCourse(Course course) {
        courseRepository.addCourse(course);
    }
}
