package com.ksb.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksb.springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
