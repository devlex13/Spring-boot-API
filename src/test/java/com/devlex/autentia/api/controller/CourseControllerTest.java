package com.devlex.autentia.api.controller;

import com.devlex.autentia.api.domain.Course;
import com.devlex.autentia.api.service.CourseService;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CourseControllerTest {

    private CourseController courseController;

    private CourseService courseService;

    @Before
    public void init() {
        courseService = mock(CourseService.class);
        courseController = new CourseController(courseService);
    }

    @Test
    public void shouldReturnAllCourses() {
        // Given
        // When
        courseController.getAllCourses();
        // Then
        verify(courseService, times(1)).getAllActiveCourses();

    }

    @Test
    public void shouldAddOneCourse() {
        // Given
        Course course = new Course(true, 1, "Java 01", "Basico", 24);

        // When
        courseController.addCourse(course);

        // Then
        verify(courseService, times(1)).addCourse(course);
    }
}
