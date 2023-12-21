package com.example.demoRestAPI.dao;

import com.example.demoRestAPI.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer>{
}
