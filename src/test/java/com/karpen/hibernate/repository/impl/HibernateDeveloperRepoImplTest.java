package com.karpen.hibernate.repository.impl;

import com.karpen.hibernate.model.Developer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

class HibernateDeveloperRepoImplTest {
    private final HibernateDeveloperRepoImpl mockDeveloperService = mock(HibernateDeveloperRepoImpl.class);
    private final Developer developer = mock(Developer.class);
    @Test
    void create_return_UpDeveloper() {
        Developer creatDeveloper = mockDeveloperService.create(developer);
        assertEquals(creatDeveloper, mockDeveloperService.create(developer));
    }
    @Test
    void create_check() {
        mockDeveloperService.create(developer);
        verify(mockDeveloperService).create(developer);
    }

    @Test
    void update_check() {
        mockDeveloperService.update(developer);
        verify(mockDeveloperService).update(developer);
    }

    @Test
    void update_return_developer() {
        Developer developer1 = mockDeveloperService.update(developer);
        assertEquals(developer1, mockDeveloperService.update(developer));
    }


    @Test
    void getAll_check() {
        mockDeveloperService.getAll();
        verify(mockDeveloperService).getAll();
    }

    @Test
    void getAll_return_developerList() {
        List<Developer> developerList = new ArrayList<>();
        assertEquals(developerList, mockDeveloperService.getAll());
    }

    @Test
    void deleteById_check() {
        mockDeveloperService.deleteById(anyLong());
        verify(mockDeveloperService).deleteById(anyLong());
    }

    @Test
    void deleteById_return_throw() {
        doThrow(new NullPointerException()).when(mockDeveloperService).deleteById(-1L);
    }

}