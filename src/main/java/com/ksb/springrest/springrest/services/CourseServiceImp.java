package com.ksb.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksb.springrest.springrest.dao.CourseDao;
import com.ksb.springrest.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService {
	
	@Autowired
	public CourseDao courseDao;

	// constructor
	public CourseServiceImp() {

	}

	// GET ALL
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	// GET ID
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getReferenceById(courseId);
	}

	// POST
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	// UPDATE
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	//DELETE
	@Override
	public void deleteCourse(Long parseLong) {
		Course entity = courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);		
	}
}
