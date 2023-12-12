package com.example.demoJPA.dao;

import com.example.demoJPA.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class StudentDaoImp implements StudentDao{

    private EntityManager entityManager;
@Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
     @Transactional
    public void save(Student thestudent) {
        entityManager.persist(thestudent);
    }

    @Override
    public Student findRecord(Integer roll_no) {
       return entityManager.find(Student.class,roll_no);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery=entityManager.createQuery("FROM Student ",Student.class);
          return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void deleteRecord(Integer roll_no) {
        Student student=entityManager.find(Student.class,roll_no);
       entityManager.remove(student);
        System.out.println("delete record");
    }

    @Override
    @Transactional
    public Student updateData(Student student) {
       return  entityManager.merge(student);

    }


}
