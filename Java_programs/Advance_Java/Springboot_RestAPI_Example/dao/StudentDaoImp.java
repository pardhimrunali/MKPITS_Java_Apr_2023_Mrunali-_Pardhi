package com.example.demoRestAPI.dao;

import com.example.demoRestAPI.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Repository
public class StudentDaoImp implements StudentDao{

private EntityManager entityManager;
@Autowired
    public StudentDaoImp( EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAllRecord() {
        TypedQuery<Student> typedQuery=entityManager.createQuery("FROM Student ",Student.class);
        return typedQuery.getResultList();
    }
}
