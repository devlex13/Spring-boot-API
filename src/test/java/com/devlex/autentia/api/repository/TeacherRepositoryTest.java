package com.devlex.autentia.api.repository;

import com.devlex.autentia.api.mapper.TeacherMapper;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TeacherRepositoryTest {

    private TeacherRepository teacherRepository;

    private TeacherMapper teacherMapper;

    @Before
    public void init() {
        teacherMapper = mock(TeacherMapper.class);

        teacherRepository = new TeacherRepository(teacherMapper);
    }

    @Test
    public void shouldReturnAllTeachers() {
        // Given
        // When
        teacherRepository.getAllTeachers();
        // Then
        verify(teacherMapper, times(1)).findAll();
    }
}
