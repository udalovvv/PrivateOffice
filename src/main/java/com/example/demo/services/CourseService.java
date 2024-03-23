package com.example.demo.services;


import com.example.demo.entity.CourseEntity;

import java.util.List;

public interface CourseService {

    public List<CourseEntity> findAll();

    public CourseEntity findById(long id);
}
