package com.devlex.autentia.api.controller;

import com.devlex.autentia.api.domain.Course;
import com.devlex.autentia.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(value = "/courses/{id}")
    public Course getCourse(@PathVariable("id") int id){
        return courseService.getCourseById(id);
    }

    @DeleteMapping(value = "/courses/delete/{id}")
    public ResponseEntity deleteCourse(@PathVariable("id") int id){
        courseService.deleteCourse(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/courses/add")
    @ResponseBody
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

}
