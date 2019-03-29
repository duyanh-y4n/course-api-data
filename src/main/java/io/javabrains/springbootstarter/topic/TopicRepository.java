package io.javabrains.springbootstarter.topic;

// only build it as interface extending CrudRepository, because JPA will help us to implement all the method
// like getAll(), get(), delete(),... (like in TopicService class!)


import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    // CrudRepository need 2 generic type: Class to be stored a + main key (in this case is Id with type String)

}
