package com.springrest.springboot.services;

import java.util.List;

import com.springrest.springboot.entities.Course;

public interface CourseService {
	 public List<Course> getCourses();

	public Course addCourse(Course course);
}
