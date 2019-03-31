package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// CrudRepository need 2 generic type: Class to be stored a + main key (in this case is Id with type String)
public interface CourseRepository extends CrudRepository<Course, String> {
    //declare a DB filter function with the name format provided by the framework, the implementation is done by the
    // frame works it self => function name ~ DB query
    public List<Course> findByTopicId(String topicId); //this will make filter map to Id property of topic object in DB
//    public List<Course> findByTopic(String topicId);  //this will make filter map to the topic object in DB

}
