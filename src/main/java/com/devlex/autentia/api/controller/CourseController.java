package com.devlex.autentia.api.controller;

import com.devlex.autentia.api.domain.Course;
import com.devlex.autentia.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllActiveCourses();
    }

    @PostMapping(value = "/courses/add")
    @ResponseBody
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }
}
