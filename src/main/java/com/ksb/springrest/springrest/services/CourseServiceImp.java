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
	private CourseDao courseDao;

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

}


//static code-dump
/*
 * List<Course> list;

 list = new ArrayList<>();
		list.add(new Course(11, "Core java", "basic java course"));
		list.add(new Course(22, "Angular", "basic angular course"));
		list.add(new Course(33, "spring-boot", "creating rest api using springboot course"));
		
		GET by ID
		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		
		POST
		list.add(course);
		
		UPDATE
		list.forEach(e -> {
			if (e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
 */
