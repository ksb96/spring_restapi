package com.ksb.springrest.springrest.services;

import java.util.List;

import com.ksb.springrest.springrest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
}
