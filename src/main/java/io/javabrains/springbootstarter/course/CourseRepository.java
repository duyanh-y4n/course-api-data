package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
    // CrudRepository need 2 generic type: Class to be stored a + main key (in this case is Id with type String)

}
