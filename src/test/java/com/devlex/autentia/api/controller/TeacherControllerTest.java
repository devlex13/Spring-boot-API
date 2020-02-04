package com.devlex.autentia.api.controller;

import com.devlex.autentia.api.service.TeacherService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TeacherControllerTest {

    private TeacherController teacherController;

    private TeacherService teacherService;

    @Before
    public void init() {
        teacherService = mock(TeacherService.class);
        teacherController = new TeacherController(teacherService);
    }

    @Test
    public void shouldReturnAllTeachers() {
        // Given

        // When
        teacherController.getAllTeachers();

        // Then
        verify(teacherService, times(1)).getAllTeachers();
    }
}
