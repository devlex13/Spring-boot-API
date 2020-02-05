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
        Course course = Course.builder().active(true).teacher(1).title("Java 01").level("Basico").hours(23).build();

        // When
        courseController.addCourse(course);

        // Then
        verify(courseService, times(1)).addCourse(course);
    }
}
