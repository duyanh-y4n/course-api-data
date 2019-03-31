package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired //Dependency injection
    private CourseService courseService;

    @RequestMapping("topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return this.courseService.getAllCourses(topicId);
    }

    @RequestMapping("topics/{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable("id") String id) {
        return this.courseService.getCourseByName(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        this.courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{topicId}/courses/{id}")
    public void updateCourseById(@PathVariable String id, @RequestBody Course newCourse, @PathVariable String topicId) {
        newCourse.setTopic(new Topic(topicId, "", ""));
        this.courseService.updateCourse(id, newCourse);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{topicId}courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        this.courseService.deleteCourse(id);
    }

}
