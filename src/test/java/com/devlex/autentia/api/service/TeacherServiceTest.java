package com.devlex.autentia.api.service;

import com.devlex.autentia.api.repository.TeacherRepository;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TeacherServiceTest {

    private TeacherService teacherService;

    private TeacherRepository teacherRepository;

    @Before
    public void init() {

        teacherRepository = mock(TeacherRepository.class);

        teacherService = new TeacherService(teacherRepository);
    }

    @Test
    public void shouldReturnAllTeachers() {
        // Given
        // When
        teacherService.getAllTeachers();
        // Then
        verify(teacherRepository, times(1)).getAllTeachers();
    }
}
