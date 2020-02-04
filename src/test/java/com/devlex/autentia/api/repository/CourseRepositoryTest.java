package com.devlex.autentia.api.repository;

import com.devlex.autentia.api.mapper.CourseMapper;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CourseRepositoryTest {

    private CourseMapper courseMapper;

    private CourseRepository courseRepository;

    @Before
    public void init() {
        courseMapper = mock(CourseMapper.class);

        courseRepository = new CourseRepository(courseMapper);
    }

    @Test
    public void shouldReturnAllCourses() {
        // Given
        // when
        courseRepository.getAllActiveCourses();
        // Then
        verify(courseMapper, times(1)).findAll();
    }
}
