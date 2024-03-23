package com.example.demo.services.Impl;

import com.example.demo.entity.CourseEntity;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl  implements CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseEntity> findAll() {
        List<CourseEntity> courseEntityList =  courseRepository.findAll();
        return courseEntityList;
    }

    @Override
    public CourseEntity findById(long id) {
        return courseRepository.findById(id).orElse(new CourseEntity());
    }


}
