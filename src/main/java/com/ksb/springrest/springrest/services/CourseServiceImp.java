package com.ksb.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ksb.springrest.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService {

	List<Course> list;

	// constructor
	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(11, "Core java", "basic java course"));
		list.add(new Course(22, "Angular", "basic angular course"));
		list.add(new Course(33, "spring-boot", "creating rest api using springboot course"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
