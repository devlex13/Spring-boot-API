package com.devlex.autentia.api.service;

import com.devlex.autentia.api.domain.Course;
import com.devlex.autentia.api.repository.CourseRepository;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CourseServiceTest {

    private CourseRepository courseRepository;

    private CourseService courseService;

    @Before
    public void init() {
        courseRepository = mock(CourseRepository.class);
        courseService = new CourseService(courseRepository);
    }

    @Test
    public void shouldReturnAllActiveCourses() {
        // Given
        courseService.getAllActiveCourses();
        // Then
        verify(courseRepository, times(1)).getAllActiveCourses();
    }

    @Test
    public void shouldAddCourse() {
        // Given
        Course course = Course.builder().active(true).teacher(1).title("Java 01").level("Basico").hours(23).build();

        // When
        courseService.addCourse(course);

        // Then
        verify(courseRepository, times(1)).addCourse(course);
    }

}
