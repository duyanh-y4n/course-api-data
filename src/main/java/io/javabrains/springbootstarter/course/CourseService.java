package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    private List<Course> courses = new ArrayList<>();

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<Course>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourseByName(String id) {
        return this.courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course newCourse) {
        this.courseRepository.save(newCourse);
    }

    public void updateCourse(String id, Course course) {
        this.courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        this.courseRepository.deleteById(id);
    }

}
