package com.ksb.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ksb.springrest.springrest.entities.Course;
import com.ksb.springrest.springrest.services.CourseService;

@RestController
public class ControllerClass {
		
	@Autowired
	//tell springboot to create an object for a class and inject it to another class
	private CourseService courseService;
	
//	@GetMapping("/home")
//	public String home() {
//		return "Welecome";
//	}
	
	//GET req, list of courses
	//Course-to store data(entity class)
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path = "/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
}
