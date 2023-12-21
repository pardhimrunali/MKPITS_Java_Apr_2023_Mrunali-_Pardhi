package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.CourseRepository;
import com.example.demoRestAPI.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImplementation implements CourseService{
    private CourseRepository courseRepository;
    @Autowired

    public CourseImplementation(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }



}
